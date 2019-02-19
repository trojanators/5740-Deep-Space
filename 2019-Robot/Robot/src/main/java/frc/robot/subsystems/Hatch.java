package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.OI;

public class Hatch {
  public Hatch() {}
  public static void tilt(String direction) {
    switch(direction) {
      case "forward":
        OI.hatchTiltSolenoid.set(DoubleSolenoid.Value.kForward);
      break;
      case "back":
        OI.hatchTiltSolenoid.set(DoubleSolenoid.Value.kReverse);
      break;
    }
  }
  public static void toggleTilt() {
    switch(OI.hatchTiltSolenoid.get()) {
      case kForward:
        tilt("back");
        break;
      case kReverse:
        tilt("forward");
        break;
      case kOff:
        tilt("forward");
        break;
    }
  }
  public static void actuate(String direction) {
    switch(direction) {
      case "open":
        OI.hatchActuateSolenoid.set(DoubleSolenoid.Value.kForward);
      break;
      case "close":
        OI.hatchActuateSolenoid.set(DoubleSolenoid.Value.kReverse);
      break;
    }
  } 
  public static void toggleActuation() {
    switch(OI.hatchActuateSolenoid.get()) {
      case kForward:
        actuate("close");
        break;
      case kReverse:
        actuate("open");
        break;
      case kOff:
        actuate("close");
        break;
    }
  }
}