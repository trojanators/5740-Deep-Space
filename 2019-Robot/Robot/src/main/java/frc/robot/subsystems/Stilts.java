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
                        OI.frontStiltDown.set(DoubleSolenoid.Value.kReverse);
                    break;
                    case "down": //make robot lower
                        OI.frontStiltUp.set(DoubleSolenoid.Value.kReverse);
                        OI.frontStiltDown.set(DoubleSolenoid.Value.kForward);
                    break;
                }
            break;
            case "back": //back pair of stilts
                switch(direction) {
                    case "up": //make robot rise
                        OI.backStiltUp.set(DoubleSolenoid.Value.kForward);
                        OI.backStiltDown.set(DoubleSolenoid.Value.kReverse);
                    break;
                    case "down": //make robot lower
                        OI.backStiltUp.set(DoubleSolenoid.Value.kReverse);
                        OI.backStiltDown.set(DoubleSolenoid.Value.kForward);
                    break;
                }
            break;
        }
    }
    public static void setDefault() {
        OI.frontStiltUp.set(DoubleSolenoid.Value.kReverse);
        OI.frontStiltDown.set(DoubleSolenoid.Value.kReverse);
        OI.backStiltUp.set(DoubleSolenoid.Value.kReverse);
        OI.backStiltDown.set(DoubleSolenoid.Value.kReverse);
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