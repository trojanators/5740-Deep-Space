package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.OI;

public class Drivetrain {
  public  static Boolean state = new Boolean(state);
  public Drivetrain() {}
  public static void shift(String direction) {
    switch(direction) {
      case "up":
      state = true;
        OI.shiftSolenoid.set(DoubleSolenoid.Value.kForward);      
      break;
      case "down":
      state = false;
        OI.shiftSolenoid.set(DoubleSolenoid.Value.kReverse);      
      break;
    }
  }
  public static void periodic() {
    OI.drive.arcadeDrive(-OI.controller1.getRawAxis(1), OI.controller1.getRawAxis(4));
  }
}