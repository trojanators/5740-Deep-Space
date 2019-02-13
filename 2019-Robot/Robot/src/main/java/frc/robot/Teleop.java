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
     if(OI.controller2.getRawAxis(RobotMap.leftTrigger) != 0) { //open hatch manipulator
         Hatch.actuate("open");
     }
     if(OI.controller2.getRawAxis(RobotMap.rightTrigger) != 0) { //close hatch manipulator
         Hatch.actuate("close");
     }
     if(OI.controller2.getRawAxis(RobotMap.leftStickY) != 0) { //move cargo arm up and down
        Cargo.actuateArm(OI.controller2.getRawAxis(RobotMap.leftStickY));
     } else {
        Cargo.stopArm();
     }
     if(OI.controller2.getRawButton(RobotMap.leftBumper) == true) { //tilt hatch manipulator out
         Hatch.tilt("forward");
     }
     if(OI.controller2.getRawButton(RobotMap.rightBumper) == true) { //tilt hatch manipulator in
         Hatch.tilt("back");
     }
  }
}
