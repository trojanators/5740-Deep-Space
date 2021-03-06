/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


import frc.robot.OI;
import frc.robot.subsystems.*;
import frc.robot.RobotMap;
import frc.robot.Vision.SemiCargo;
import frc.robot.Vision.SemiHatch;
import edu.wpi.first.wpilibj.DoubleSolenoid;


public class Teleop {
    public static Boolean shift = new Boolean(false);
    public static void Periodic() {
        Drivetrain.periodic();
        if (OI.controller1.getRawAxis(RobotMap.rightTrigger) != 0) { // shift up and down
            
            Drivetrain.shift("up");
            shift = true;
        } else {

            Drivetrain.shift("down");
            shift = false;
        }
        
        if (OI.controller2.getRawButton(RobotMap.leftBumper) == true) { // shoot ball
            Cargo.actuateClaw(-.35);
        } else if (OI.controller2.getRawButton(RobotMap.rightBumper) && !OI.ballLimit.get()) {
            Cargo.actuateClaw(.5);
        } else {
            Cargo.stopClaw();
        }
        
        if (OI.controller2.getRawAxis(RobotMap.rightTrigger) != 0) { // toggle hatch manipulator
            Hatch.actuate("open");
        }
        
        if (OI.controller2.getRawAxis(RobotMap.leftStickY) != 0) { // move cargo arm up and down
            Cargo.actuateArm(-OI.controller2.getRawAxis(RobotMap.leftStickY) * .5);
        
        } else if (OI.controller2.getRawAxis(RobotMap.leftStickY) == 0
                && OI.controller2.getRawButton(RobotMap.xButton) == false) {
            Cargo.stopArm();
        }
        if (OI.controller2.getRawAxis(RobotMap.leftTrigger) != 0) { // tilt hatch manipulator out
            Hatch.actuate("close");
        }

        if (OI.controller1.getRawButton(RobotMap.aButton)) { // starts semiHatch
              //  Stilts.actuate("Back", "Retract");
              //  Stilts.actuate("Front", "Extend"); 
              OI.frontStilt.set(DoubleSolenoid.Value.kForward);
             // OI.backStilt.set(DoubleSolenoid.Value.kReverse);
        }

        if (OI.controller1.getRawButton(RobotMap.bButton)) { // back stillts raise robot the front falls
           //  Stilts.actuate("Back", "Extend");
           //  Stilts.actuate("Front", "Retract");
           OI.frontStilt.set(DoubleSolenoid.Value.kReverse);
           //OI.backStilt.set(DoubleSolenoid.Value.kForward);
            }
        if(OI.controller1.getRawButton(RobotMap.xButton)) {
            OI.backStilt.set(DoubleSolenoid.Value.kForward);
        }
        if (OI.controller1.getRawButton(RobotMap.yButton)){
           // Stilts.actuate("Back", "Retract");
          // OI.frontStilt.set(DoubleSolenoid.Value.kReverse);
           OI.backStilt.set(DoubleSolenoid.Value.kReverse);
        }
/*
    if(OI.controller2.getRawButton(4)) {
        Stilts.actuateFrontWheels(1);

    } else {
        Stilts.stopFrontWheelActuation();
    }
    if(OI.controller2.getRawButton(RobotMap.bButton)) { //dog ears in/out
        Stilts.rotateFrontWheels(1);
    } else if (OI.controller2.getRawButton(RobotMap.aButton)){
        Stilts.rotateFrontWheels(-1);
        Hatch.tilt("back");
    } else {
        Stilts.stopFrontWheelRotation();
    }
    */
    if(OI.controller2.getRawButton(RobotMap.xButton)) {
        Hatch.tilt("forward");
    } else if (OI.controller2.getRawButton(RobotMap.yButton)) {
        Hatch.tilt("back");
    }
    if(OI.ballLimit.get() && !OI.controller2.getRawButton(RobotMap.leftBumper)) {
        OI.cargoIntake.set(0.05);
       }
      }
    }
