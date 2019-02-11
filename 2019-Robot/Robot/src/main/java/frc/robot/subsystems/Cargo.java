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
  public static void actuateClaw(String direction) {
    //TODO: Limit switch to stop motors when ball is in the claw
    switch(direction) { //TODO: make motors spin opposite direction
      case "in":
        OI.cargoClawLeft.setInverted(false);
        OI.cargoClawRight.setInverted(false);
        OI.cargoClawLeft.set(ControlMode.PercentOutput, 100);
        OI.cargoClawRight.set(ControlMode.PercentOutput, 100);
      break;
      case "out":
        OI.cargoClawLeft.setInverted(true);
        OI.cargoClawRight.setInverted(true);
        OI.cargoClawLeft.set(ControlMode.PercentOutput, 100);
        OI.cargoClawRight.set(ControlMode.PercentOutput, 100);
      break;
    }
  }
  public static void stopClaw() {
    OI.cargoClawLeft.set(ControlMode.PercentOutput, 0);
    OI.cargoClawRight.set(ControlMode.PercentOutput, 0);
  }
}