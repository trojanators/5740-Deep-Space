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
     if(OI.controller2.getRawButton(RobotMap.rightBumper) == true && OI.ballLimit.get() == false) { //intake ball
         Cargo.actuateClaw(.5);
     } else if(OI.controller2.getRawButton(RobotMap.leftBumper) == true) { //shoot ball
        Cargo.actuateClaw(-.5);
     } else {
         Cargo.stopClaw();
     }
     if(OI.controller1.getRawAxis(RobotMap.rightTrigger) != 0) { //toggle hatch manipulator
         Hatch.toggleActuation();
     }
     if(OI.controller2.getRawAxis(RobotMap.leftStickY) != 0) { //move cargo arm up and down
        Cargo.actuateArm(-OI.controller2.getRawAxis(RobotMap.leftStickY) * .5);
     } else if (OI.controller2.getRawAxis(RobotMap.leftStickY) == 0 && OI.controller2.getRawButton(RobotMap.xButton) == false) {
        Cargo.stopArm();
     }
     if(OI.controller1.getRawAxis(RobotMap.leftTrigger) != 0) { //tilt hatch manipulator out
         Hatch.toggleTilt();
     }
     if(OI.controller1.getRawButton(RobotMap.startButton) == true){ //deploy stilts
        Stilts.actuate("front", "up");
        Stilts.actuate("back", "up");
     }
    if(OI.controller1.getRawButton(RobotMap.aButton)) { //pull front stilts up
        Stilts.actuate("front", "down");
    }
    if(OI.controller1.getRawButton(RobotMap.bButton)) { //pull back stilts up
        Stilts.actuate("back", "down");
    }
    if(OI.controller2.getRawButton(4)) {
        Stilts.rotateFrontWheels(1);
    } else {
        Stilts.stopFrontWheelRotation();
    }
  }
}
