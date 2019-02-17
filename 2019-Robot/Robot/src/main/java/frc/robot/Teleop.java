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
import frc.robot.logging.sparkmaxlog;

public class Teleop {
    public static void Periodic(){
      Drivetrain.periodic();
      if(OI.controller1.getRawAxis(RobotMap.rightTrigger) != 0) { // shift up and down
        Drivetrain.shift("up");
      } else {
     
        Drivetrain.shift("down");
     }
     if(OI.controller2.getRawButton(RobotMap.aButton) == true) { //shoot ball
         Cargo.actuateClaw(.5);
     }
     if(OI.controller2.getRawButton(RobotMap.bButton) == true) { //intake ball
        Cargo.actuateClaw(-.5);
     } 
     if(OI.controller2.getRawButton(RobotMap.aButton) == false && OI.controller2.getRawButton(RobotMap.bButton) == false) {
         Cargo.stopClaw();
     }
     if(OI.limitInput.get() && OI.controller2.getRawButton(RobotMap.bButton)){
         Cargo.stopClaw();
     }
     if(OI.controller1.getRawAxis(RobotMap.leftTrigger) != 0) { //open hatch manipulator
         Hatch.actuate("open");
     }
     if(OI.controller2.getRawAxis(RobotMap.rightTrigger) != 0) { //close hatch manipulator
         Hatch.actuate("close");
     }
    /* if(OI.controller2.getRawAxis(RobotMap.leftStickY) != 0 && OI.cargoArmActuateOne.getAppliedOutput() == 0) { //move cargo arm up and down
        OI.cargoArmActuateOne.set(-OI.controller2.getRawAxis(RobotMap.leftStickY));
     } else if (OI.controller2.getRawAxis(RobotMap.leftStickY) == 0 && OI.cargoArmActuateOne.getAppliedOutput() != 0) {
        OI.cargoArmActuateOne.set(0);
     }*/
     if(OI.controller2.getRawButton(RobotMap.xButton)){
        Cargo.actuateArm(RobotMap.cargoClawSpeed);
     } else {
            Cargo.stopArm();

     }
     if(OI.controller2.getRawButton(RobotMap.yButton)) {
         sparkmaxlog.logging();
     }
     if(OI.controller2.getRawButton(RobotMap.leftBumper) == true) { //tilt hatch manipulator out
         Hatch.tilt("forward");
     }
     if(OI.controller2.getRawButton(RobotMap.rightBumper) == true) { //tilt hatch manipulator in
         Hatch.tilt("back");
     }
     if(OI.controller1.getRawButton(RobotMap.xButton) == true){ //deploy stilts
        Stilts.actuate("front", "up");
        Stilts.actuate("back", "up");
        System.out.println("up");
     }
     if(OI.controller1.getRawButton(RobotMap.yButton) == true){ //retract pistons
        Stilts.actuate("front", "down");
        Stilts.actuate("back", "down");
        System.out.println("down");
    }
  }
}
