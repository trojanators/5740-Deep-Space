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
   // OI.cargoArmActuate.set(ControlMode.PercentOutput, 0);
  }
  public static void actuateClaw(double speed) {
    //TODO: Limit switch to stop motors when ball is in the claw
<<<<<<< HEAD
   /* switch(direction) {
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
    }*/
=======
        OI.cargoClawLeft.set(ControlMode.PercentOutput, speed);
        OI.cargoClawRight.set(ControlMode.PercentOutput, speed);
>>>>>>> 6f216bfb3d99f202ae1d5395d369a21a59a6e09e
  }
  public static void stopClaw() {
   // OI.cargoClawLeft.set(ControlMode.PercentOutput, 0);
   // OI.cargoClawRight.set(ControlMode.PercentOutput, 0);
  }
}