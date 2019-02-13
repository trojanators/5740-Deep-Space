package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;

import frc.robot.OI;

public class Cargo {
  public Cargo() {}
  public static void actuateArm(double speed) {
    OI.cargoArmActuateOne.set(speed);
    OI.cargoArmActuateTwo.set(speed);
  }
  public static void stopArm() {
    OI.cargoArmActuateOne.set(0);
    OI.cargoArmActuateTwo.set(0);
  }
  public static void actuateClaw(double speed) {
    //TODO: Limit switch to stop motors when ball is in the claw
        OI.cargoClawLeft.set(ControlMode.PercentOutput, speed);
        OI.cargoClawRight.set(ControlMode.PercentOutput, speed);
  }
  public static void stopClaw() {
    OI.cargoClawLeft.set(ControlMode.PercentOutput, 0);
    OI.cargoClawRight.set(ControlMode.PercentOutput, 0);
  }
}