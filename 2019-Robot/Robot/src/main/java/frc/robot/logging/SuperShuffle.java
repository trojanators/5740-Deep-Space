package frc.robot.logging;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.ComplexWidget;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import frc.robot.*;
import frc.robot.subsystems.Drivetrain;

public class SuperShuffle {

    private static ShuffleboardTab tab = Shuffleboard.getTab("Driver Info");
    private static NetworkTableEntry controller1XEntry = tab.add("controller1 X value", OI.controller1.getRawAxis(1))
            .withWidget(BuiltInWidgets.kNumberBar)
            .withPosition(0, 0)
            .withSize(2, 1)
            .getEntry();

    private static NetworkTableEntry controller1YEntry = 
    tab.add("Controller 1 Y value", OI.controller1.getRawAxis(4))
            .withWidget(BuiltInWidgets.kNumberBar)
            .withPosition(0, 1)
            .withSize(2, 1)
            .getEntry();

    private static ComplexWidget pdp = 
    tab.add("Power",OI.pdp)
    .withWidget(BuiltInWidgets.kPowerDistributionPanel)
    .withPosition(0, 2)
    .withSize(3, 3);
/*
    private static NetworkTableEntry pressureEntry =
    tab.add("pressure", OI.pressureSwitch.getPressureSwitchValue() )
   .withPosition(9,2)
   .withSize(2, 1)
   .withWidget(BuiltInWidgets.kBooleanBox)
   .getEntry();*/

   private static NetworkTableEntry speedEntry = 
    tab.add("axis acc",OI.accelerometer.getX())
    .withPosition(8,3)
    .withSize(3, 2)
    .withWidget(BuiltInWidgets.kGraph)
    .getEntry();
    
    private static NetworkTableEntry ShiftEntry = 
    tab.add ("Shifting", Drivetrain.state)
    .withPosition(9,2)
    .withSize(2,1)
    .withWidget(BuiltInWidgets.kBooleanBox)
    .getEntry();

    private static NetworkTableEntry pressureEntry= 
    tab.add ("CompressorStatus", OI.pressureSwitch.getPressureSwitchValue())
    .withPosition(9,1)
    .withSize(2,1)
    .withWidget(BuiltInWidgets.kBooleanBox)
    .getEntry();
   // private static 
/*
     private static NetworkTableEntry cameraETableEntry=
     tab.add("LiveFeed",camera)
     .withPosition(3,6)
     .withSize(4,5)
     .withWidget(BuiltInWidgets.kcamera)

     .getEntry()
     ;
*/
     public static void Periodic() {
        
        ShiftEntry.setBoolean(Drivetrain.state);
        speedEntry.setDouble(OI.accelerometer.getY());
        speedEntry.setDouble(OI.accelerometer.getX());
       pressureEntry.setBoolean(OI.pressureSwitch.getPressureSwitchValue());
        controller1XEntry.setDouble(OI.controller1.getRawAxis(4));
        controller1YEntry.setDouble(OI.controller1.getRawAxis(5));
        
    }
}