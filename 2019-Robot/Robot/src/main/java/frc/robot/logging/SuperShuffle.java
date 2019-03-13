package frc.robot.logging;

import edu.wpi.cscore.CameraServerJNI;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.CameraServer;

import edu.wpi.first.wpilibj.shuffleboard.BuiltInLayouts;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInLayouts;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.ComplexWidget;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardLayout;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import frc.robot.*;
import frc.robot.subsystems.Drivetrain;

public class SuperShuffle {
    // created driver info tab - grid layout 
    public  static ShuffleboardTab tab = Shuffleboard.getTab("Driver Info");
    public static ShuffleboardLayout lay = tab.getLayout("Driver Info", BuiltInLayouts.kGrid);
    
    // analog pressure sensor
   static double text ;
       
    // Data  displayed on Shuffleborard
    private static NetworkTableEntry controller1XEntry = 
    lay.add("controller1 X value", OI.controller1.getRawAxis(1))
            .withWidget(BuiltInWidgets.kNumberBar)
            .withPosition(0, 0)
            .withSize(2, 1)
            .getEntry();

    private static NetworkTableEntry controller1YEntry = 
    lay.add("Controller 1 Y value", OI.controller1.getRawAxis(4))
            .withWidget(BuiltInWidgets.kNumberBar)
            .withPosition(0, 1)
            .withSize(2, 1)
            .getEntry();

    private static ComplexWidget pdp = 
    lay.add("Power",OI.pdp)
    .withWidget(BuiltInWidgets.kPowerDistributionPanel)
    .withPosition(0, 2)
    .withSize(3, 3);


   private static NetworkTableEntry speedEntry = 
    lay.add("axis acc",OI.accelerometer.getX())
    .withPosition(9,3)
    .withSize(3, 2)
    .withWidget(BuiltInWidgets.kGraph)
    .getEntry();
    
    private static NetworkTableEntry shiftEntry = 
    tab.add ("Shifting", Drivetrain.state)
    .withPosition(9,2)
    .withSize(2,1)
    .withWidget(BuiltInWidgets.kBooleanBox)
    .getEntry();

     private static NetworkTableEntry pressureStatusEntry = 
    lay.add ("Pressure",text)
    .withPosition(9,1)
    .withSize(2,2)
    .withWidget(BuiltInWidgets.kDial)
    .getEntry();

    // updates every 5 ms
     public static void Periodic() {
        double averageVolts = OI.Pressureread.getAverageVoltage();
        double pressure = (250*(averageVolts/5.0))-25;

        speedEntry.setDouble(OI.accelerometer.getY());
        speedEntry.setDouble(OI.accelerometer.getX());
        shiftEntry.setBoolean(Drivetrain.state);
        pressureStatusEntry.setDouble(pressure);
        controller1XEntry.setDouble(OI.controller1.getRawAxis(4));
        controller1YEntry.setDouble(OI.controller1.getRawAxis(5));
        
    }
}