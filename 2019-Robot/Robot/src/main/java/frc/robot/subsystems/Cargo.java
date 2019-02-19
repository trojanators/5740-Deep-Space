package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;

import frc.robot.OI;

import frc.robot.RobotMap;

public class Cargo {
  public Cargo() {}
   
  public static void actuateArm(double speed) {
  
    OI.cargoArmActuateOne.set(speed);
  }
  public static void stopArm() {
    //OI.cargoArmActuateOne(ControlMode.PrecentOutput, 0);
    OI.cargoArmActuateOne.set(0);

  }
  public static void actuateClaw(double speed) {
    //TODO: Limit switch to stop motors when ball is in the claw
        OI.cargoClawLeft.set(speed);
        OI.cargoClawRight.set(speed);
  }
  public static void stopClaw() {
    OI.cargoClawLeft.set(0);
    OI.cargoClawRight.set(0);
  }
}