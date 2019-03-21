/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.subsystems.*;
import frc.robot.*;
import frc.robot.logging.DataShuffle;
import frc.robot.logging.SlimShuffle;

public class Robot extends TimedRobot {
@Override
  public void robotInit() {
    CamerConfig.Config();  
  }
  
  @Override
  public void robotPeriodic() {
    SlimShuffle.Periodic();
    DataShuffle.Periodic();
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
    Teleop.Periodic();

  }

  @Override
  public void teleopInit(){
   Cargo.cargoTimer.start();
  }

  @Override
  public void teleopPeriodic() {
    Teleop.Periodic();
  }

  @Override
  public void testPeriodic() {
  }
  @Override
  public void disabledInit() {
    Cargo.cargoTimer.stop();
    }
  }
