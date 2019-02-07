package frc.robot.subsystems;

import frc.robot.OI;
import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Ramp {
    public Ramp(){}
    public static void actuate(String direction){
        switch(direction){
            case "up": //deploy ramp
            //    OI.leftRamp.set(DoubleSolenoid.Value.kForward);
             //   OI.rightRamp.set(DoubleSolenoid.Value.kForward);
            break;
            case "down": //retract piston
            //    OI.leftRamp.set(DoubleSolenoid.Value.kReverse);
            //    OI.rightRamp.set(DoubleSolenoid.Value.kReverse);
            break;
        }

    }
}
