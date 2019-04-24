package frc.robot.subsystems;

import frc.robot.OI;
import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Stilts {
    public Stilts() {}
    public static void pressurize() {
        //TODO: Code to pressurize the stilt cylinders
    }
    public static void actuate(String pair, String direction) {
        switch(pair) {
            case "front": //front pair of stilts
                switch(direction) {
                    case "up": //make robot rise
                        OI.frontStiltUp.set(DoubleSolenoid.Value.kForward);
                        OI.frontStiltretract.set(DoubleSolenoid.Value.kReverse);
                    break;
                    case "retract": //make robot lower
                        OI.frontStiltUp.set(DoubleSolenoid.Value.kReverse);
                        OI.frontStiltretract.set(DoubleSolenoid.Value.kForward);
                    break;
                }
            break;
            case "retract": //retract pair of stilts
                switch(direction) {
                    case "up": //make robot rise
                        OI.retractStiltUp.set(DoubleSolenoid.Value.kForward);
                        OI.retractStiltretract.set(DoubleSolenoid.Value.kReverse);
                    break;
                    case "retract": //make robot lower
                        OI.retractStiltUp.set(DoubleSolenoid.Value.kReverse);
                        OI.retractStiltretract.set(DoubleSolenoid.Value.kForward);
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
        OI.stiltActuateGroup.set(speed);
    }
    public static void rotateFrontWheels(double speed) {
        OI.stiltRotateGroup.set(speed);
    }
    public static void stopFrontWheelActuation() {
        OI.stiltActuateGroup.set(0);
    }
    public static void stopFrontWheelRotation() {
        OI.stiltRotateGroup.set(0);
    }
}