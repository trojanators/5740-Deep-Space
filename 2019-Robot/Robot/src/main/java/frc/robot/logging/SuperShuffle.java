package frc.robot.logging;

import edu.wpi.cscore.VideoSink;
import edu.wpi.cscore.VideoSource;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.ComplexWidget;
import edu.wpi.first.wpilibj.shuffleboard.SendableCameraWrapper;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.shuffleboard.SimpleWidget;
import frc.robot.*;
import frc.robot.OI;

public abstract class SuperShuffle {
        public static ShuffleboardTab tab = Shuffleboard.getTab("Driver Info");
        public static NetworkTableEntry controller1XEntry = 
        tab.add("controller1 X value", OI.controller1.getRawAxis(1))
        .withWidget(BuiltInWidgets.kNumberBar)
        .withPosition(0, 0)
        .withSize(2, 1)
        .getEntry();
         public static NetworkTableEntry controller1YEntry = 
         tab.add("Controller 1 Y value", OI.controller1.getRawAxis(4))
        .withWidget(BuiltInWidgets.kNumberBar)
        .withPosition(0, 1)
        .withSize(2, 1)
        .getEntry();

        public static ComplexWidget pdp = 
        tab.add("Power", OI.pdp)
        .withWidget(BuiltInWidgets.kPowerDistributionPanel)
        .withPosition(0, 2)
         .withSize(3, 3);

        public static NetworkTableEntry pressureEntry = 
        tab.add("Compressor", OI.pressureSwitch.enabled())
         .withPosition(9, 2)
        .withSize(2, 1)
        .withWidget(BuiltInWidgets.kBooleanBox)
        .getEntry();

        public static NetworkTableEntry speedEntry =
         tab.add("axis acc", OI.accelerometer.getX())
         .withPosition(9, 3)
        .withSize(3, 2)
        .withWidget(BuiltInWidgets.kGraph)
        .getEntry();
        
        publ
    public static void Periodic() {
        
        speedEntry.setDouble(OI.accelerometer.getX());
       // pressureEntry.setBoolean();
        controller1XEntry.setDouble(OI.controller1.getRawAxis(4));
        controller1YEntry.setDouble(-OI.controller1.getRawAxis(1));
    }
}