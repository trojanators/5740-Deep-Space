package frc.robot.logging;

import java.net.NetworkInterface;
import java.nio.channels.NetworkChannel;
import java.util.stream.Stream;

import edu.wpi.cscore.MjpegServer;
import edu.wpi.cscore.VideoSource;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.NetworkTableValue;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.ComplexWidget;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.shuffleboard.SimpleWidget;
import frc.robot.*;
import frc.robot.subsystems.Drivetrain;


public class SuperShuffle {
    private static String camserver0 = "mjpg:http://frcvision.local:1181/?action=stream*";
    private static String camserver2 = "mjpg:http://frcvision.local:1182/?action=stream";
    private static String camserver3= "";
    
    private static ShuffleboardTab cam = Shuffleboard.getTab("Camera view");
    private static ShuffleboardTab tab = Shuffleboard.getTab("Driver Info");

    private static NetworkTableEntry controller1XEntry =
     tab.addPersistent("controller1 X value", OI.controller1.getRawAxis(1))
        .withWidget(BuiltInWidgets.kNumberBar).withPosition(0, 0).withSize(2, 1).getEntry();

    private static NetworkTableEntry controller1YEntry = tab.addPersistent("Controller 1 Y value", OI.controller1.getRawAxis(4))
            .withWidget(BuiltInWidgets.kNumberBar).withPosition(0, 1).withSize(2, 1).getEntry();

    private static ComplexWidget pdp = tab.add("Power", OI.pdp).withWidget(BuiltInWidgets.kPowerDistributionPanel)
            .withPosition(0, 2).withSize(3, 3);
    /*
     * private static NetworkTableEntry pressureEntry = tab.add("pressure",
     * OI.pressureSwitch.getPressureSwitchValue() ) .withPosition(9,2) .withSize(2,
     * 1) .withWidget(BuiltInWidgets.kBooleanBox) .getEntry();
     */

    private static NetworkTableEntry speedEntry = tab.add("axis acc", OI.accelerometer.getX()).withPosition(8, 3)
            .withSize(3, 2).withWidget(BuiltInWidgets.kGraph).getEntry();

    private static NetworkTableEntry ShiftEntry = tab.add("Shifting", Drivetrain.state).withPosition(9, 2)
            .withSize(2, 1).withWidget(BuiltInWidgets.kBooleanBox).getEntry();

    private static NetworkTableEntry pressureEntry = 
    tab.add("CompressorStatus", OI.pressureSwitch.getPressureSwitchValue())
            .withPosition(9, 1).withSize(2, 1)
            .withWidget(BuiltInWidgets.kBooleanBox)
            .getEntry();

    private static NetworkTableEntry balllimitEnrty = tab.add("Claw status", OI.ballLimit.get()).withPosition(9, 0)
            .withSize(2, 1).withWidget(BuiltInWidgets.kBooleanBox).getEntry();


    private static SimpleWidget cam0 = 
	tab.add(camserver0,"camera")
        .withPosition(3,1)
        .withSize(5,5)
        .withWidget(BuiltInWidgets.kCameraStream);

    private static SimpleWidget cam2 =    
         cam.add("camera1",camserver2)  
        .withPosition(0,1)
        .withSize(5,5)
        .withWidget(BuiltInWidgets.kCameraStream);

    private static SimpleWidget cam3 = 
        cam.add("camrea2",camserver3)
        .withPosition(6,1)
        .withSize(5,5)
        .withWidget(BuiltInWidgets.kCameraStream);
    
     public static void Periodic() {

        cam0.getEntry();
        cam2.getEntry();
        cam3.getEntry();

       balllimitEnrty.setBoolean(OI.ballLimit.get());
        
       ShiftEntry.setBoolean(Drivetrain.state);
        speedEntry.setDouble(OI.accelerometer.getY());
        speedEntry.setDouble(OI.accelerometer.getX());
       
        pressureEntry.setBoolean(OI.pressureSwitch.getPressureSwitchValue());
        controller1XEntry.setDouble(OI.controller1.getRawAxis(4));
        controller1YEntry.setDouble(OI.controller1.getRawAxis(5));
        
    }
}