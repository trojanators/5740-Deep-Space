/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;

import frc.robot.subsystems.*;
import frc.robot.*;
import frc.robot.logging.ShuffleDash;

public class Robot extends IterativeRobot {

  @Override
  public void robotInit() {

    UsbCamera Cam0 = CameraServer.getInstance().startAutomaticCapture(0);
   UsbCamera Cam1  = CameraServer.getInstance().startAutomaticCapture(1);
  
  Cam0.setBrightness(10);
  Cam0.setFPS(15);
  Cam0.setExposureAuto();

  Cam1.setBrightness(10);
  Cam1.setFPS(15);
  Cam1.setExposureAuto();
  
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
    Teleop.Periodic();
    ShuffleDash.perodic();

  }

  @Override
  public void teleopInit(){
   // ShuffleLayout.Init();
   Cargo.cargoTimer.start();
  }

  @Override
  public void teleopPeriodic() {
    Teleop.Periodic();
    ShuffleDash.perodic();

   // Cargo.update();
    //SuperShuffle.Periodic();
    // Shuffleboard.update();
  }

  @Override
  public void testPeriodic() {
  }
  @Override
  public void disabledInit() {
    Cargo.cargoTimer.stop();
  }
}
