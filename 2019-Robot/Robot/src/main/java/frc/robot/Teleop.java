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
      if(OI.controller2.getRawAxis(RobotMap.rightTrigger) != 0) { // shift up and down
        Drivetrain.shift("up");
      } else {
        Drivetrain.shift("down");
     }
     if(OI.controller1.getRawButton(RobotMap.aButton) == true) { //shoot ball
         Cargo.actuateClaw("out");
     } else {
         Cargo.stopClaw();
     }
     if(OI.controller1.getRawButton(RobotMap.bButton) == true) { //intake ball
        Cargo.actuateClaw("in");
     } else {
         Cargo.stopClaw();
     }
     if(OI.controller1.getRawAxis(RobotMap.leftTrigger) != 0) { //open hatch manipulator
         Hatch.actuate("open");
     }
     if(OI.controller1.getRawAxis(RobotMap.rightTrigger) != 0) { //close hatch manipulator
         Hatch.actuate("close");
     }
     if(OI.controller1.getRawAxis(RobotMap.leftStickY) > 0) { //move cargo arm up and down
         Cargo.actuateArm("up", OI.controller2.getRawAxis(1));
     } 
     else if(OI.controller2.getRawAxis(RobotMap.rightStickX) < 0) {
        Cargo.actuateArm("down", OI.controller2.getRawAxis(1));
     } else {
        Cargo.stopArm();
     }
     if(OI.controller1.getRawButton(RobotMap.leftBumper) == true) { //tilt hatch manipulator out
         Hatch.tilt("forward");
     }
     if(OI.controller1.getRawButton(RobotMap.rightBumper) == true) { //tilt hatch manipulator in
         Hatch.tilt("back");
     }
     if(OI.controller1.getRawButton(RobotMap.xButton) == true){ //deploy stilts
        Stilts.actuate("front", "up");
        Stilts.actuate("back", "up");
     }
     if(OI.controller1.getRawButton(RobotMap.yButton) == true){ //retract pistons
        Stilts.actuate("front", "down");
        Stilts.actuate("back", "down");
    }
  }
}
