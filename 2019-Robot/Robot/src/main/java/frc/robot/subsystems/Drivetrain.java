package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.OI;

public class Drivetrain {
  public  static Boolean state = true;
  public Drivetrain() {}
  public static void shift(String direction) {
    switch(direction) {
      case "up":
      state = true;
        OI.shiftSolenoid.set(true);      
      break;
      case "down":
      state = false;
        OI.shiftSolenoid.set(false);      
      break;
    }
  }
  public static void periodic() {
    OI.drive.arcadeDrive(-OI.controller1.getRawAxis(1), OI.controller1.getRawAxis(4));
  }
}