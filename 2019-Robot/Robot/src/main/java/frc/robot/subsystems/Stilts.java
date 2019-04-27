package frc.robot.subsystems;

import frc.robot.OI;
import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Stilts {
    public Stilts() {}
    public static void pressurize() {
        //TODO: Code to pressurize the stilt cylinders
    }
    public static void actuate(String pair, String direction) {
        /*switch(pair) {
            case "Front": //front pair of stilts
                switch(direction) {
                    case "Extend": //make robot rise
                        OI.frontStiltExtend.set(DoubleSolenoid.Value.kForward);
                        OI.frontStiltRetract.set(DoubleSolenoid.Value.kReverse);
                    break;
                    case "Retract": //make robot lower
                        OI.frontStiltRetract.set(DoubleSolenoid.Value.kReverse);
                        OI.frontStiltRetract.set(DoubleSolenoid.Value.kForward);
                    break;
                }
            break;
            case "Back": //retract pair of stilts
                switch(direction) {
                    case "Extend": //make robot rise
                        OI.backStiltExtend.set(DoubleSolenoid.Value.kForward);
                        OI.backStiltRetract.set(DoubleSolenoid.Value.kReverse);
                    break;
                    case "Retract": //make robot lower
                        OI.backStiltRetract.set(DoubleSolenoid.Value.kReverse);
                        OI.backStiltExtend.set(DoubleSolenoid.Value.kForward);
                    break;
                }
            break;
        }
    }
    public static void setDefault() {
        OI.frontStiltExtend.set(DoubleSolenoid.Value.kReverse);
        OI.frontStiltRetract.set(DoubleSolenoid.Value.kReverse);
        OI.backStiltExtend.set(DoubleSolenoid.Value.kReverse);
        OI.backStiltRetract.set(DoubleSolenoid.Value.kReverse);
    }
    public static void actuateFrontWheels(double speed) {
       // OI.stiltActuateGroup.set(speed);
    }
    public static void rotateFrontWheels(double speed) {
        OI.stiltRotateGroup.set(speed);
    }
    public static void stopFrontWheelActuation() {
       // OI.stiltActuateGroup.set(0);
    }
    public static void stopFrontWheelRotation() {
        OI.stiltRotateGroup.set(0);
    }
    */
    }
}