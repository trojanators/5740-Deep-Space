/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import frc.robot.subsystems.*;
import frc.robot.*;
import frc.robot.logging.ShuffleDash;
import frc.robot.logging.ShuffleNetworkTable;
import frc.robot.logging.tes;
public class Robot extends IterativeRobot {

  @Override
  public void robotInit() {
    ShuffleDash.init();
   
  }

  @Override
  public void robotPeriodic() {
    ShuffleNetworkTable.run();
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit(){
   // ShuffleLayout.Init();
   
  }

  @Override
  public void teleopPeriodic() {
    Teleop.Periodic();
   tes.calculate();
   // Shuffleboard.update();

  }

  @Override
  public void testPeriodic() {
  }
}
