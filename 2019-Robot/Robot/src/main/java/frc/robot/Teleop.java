/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import frc.robot.OI;
import frc.robot.subsystems.*;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.OI;
import frc.robot.*;

public class Teleop {
    public static void Periodic(){
      Drivetrain.periodic();
      if(OI.controller1.getRawAxis(3) != 0) { //shift up and down
        Drivetrain.shift("up");
      } else {
        Drivetrain.shift("down");
     }
     if(OI.controller2.getRawButton(1) == true) { //shoot ball
         Cargo.actuateClaw("out");
     } else {
         Cargo.stopClaw();
     }
     if(OI.controller2.getRawButton(2) == true) { //intake ball
        Cargo.actuateClaw("in");
     } else {
         Cargo.stopClaw();
     }
     if(OI.controller2.getRawAxis(2) != 0) { //open hatch manipulator
         Hatch.actuate("open");
     }
     if(OI.controller2.getRawAxis(3) != 0) { //close hatch manipulator
         Hatch.actuate("close");
     }
     if(OI.controller2.getRawAxis(1) != 0) { //move cargo arm up and down
         Cargo.actuateArm("up", OI.controller2.getRawAxis(1));
     } else {
         Cargo.stopArm();
     }
     if(OI.controller2.getRawButton(5) == true) { //tilt hatch manipulator out
         Hatch.tilt("forward");
     }
     if(OI.controller2.getRawButton(6) == true) { //tilt hatch manipulator in
         Hatch.tilt("back");
     }
  }
}
