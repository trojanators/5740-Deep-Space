/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.cscore.MjpegServer;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.ConfigParameter;

import frc.robot.subsystems.*;
import frc.robot.*;
import frc.robot.logging.ShuffleDash;
import frc.robot.logging.SuperShuffle;
import frc.robot.logging.robotdect;
public class Robot extends IterativeRobot {
  public static Boolean eNABLEDBoolean;
  @Override
  public void robotInit() {
    eNABLEDBoolean= false;


    //OI.cargoArmActuateOne.setParameter(ConfigParameter.kCtrlType, 1);
  }

  @Override
  public void robotPeriodic() {
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit(){
    eNABLEDBoolean= true;
   // ShuffleLayout.Init();

  }

  @Override
  public void teleopPeriodic() {
    Teleop.Periodic();
    SuperShuffle.Periodic();
   robotdect.perodic();
   // Shuffleboard.update();

  }

  @Override
  public void testPeriodic() {
  }
}
