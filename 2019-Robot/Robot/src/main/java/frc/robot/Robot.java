/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import static frc.robot.Teleop.Periodic;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.VictorSP;
import frc.robot.subsystems.*;
import frc.robot.*;
import frc.robot.Vision.CalculateDistance;
import frc.robot.logging.DataShuffle;
import frc.robot.logging.SlimShuffle;

public class Robot extends TimedRobot {
  @Override
  public void robotInit() {
    CamerConfig.Config();
    Drivetrainlimit.Limit();

  }

  @Override
  public void robotPeriodic() {

    SlimShuffle.Periodic();
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
    Periodic();

  }

  @Override
  public void teleopInit() {
    Cargo.cargoTimer.start();
  }

  @Override
  public void teleopPeriodic() {
    Periodic();
  }

  @Override
  public void testPeriodic() {
  }
  @Override
  public void disabledInit() {
    Cargo.cargoTimer.stop();
    }
  }
