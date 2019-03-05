package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.OI;

public class Hatch {
  public Hatch() {}
  public static void tilt(String direction) {
    switch(direction) {
      case "forward":
        OI.hatchTiltSolenoid.set(true);
      break;
      case "back":
        OI.hatchTiltSolenoid.set(false);
      break;
    }
  }
  public static void toggleTilt() {
    if(OI.hatchTiltSolenoid.get() == true) {
      tilt("back");
    } else {
      actuate("forward");
    }
  }
  public static void actuate(String direction) {
    switch(direction) {
      case "open":
        OI.hatchActuateSolenoid.set(true);
      break;
      case "close":
        OI.hatchActuateSolenoid.set(false);
      break;
    }
  } 
  public static void toggleActuation() {
    if(OI.hatchActuateSolenoid.get() == true) {
      actuate("close");
    } else {
      actuate("open");
    }
  }
}