package frc.robot;

import edu.wpi.first.wpilibj.shuffleboard.BuiltInLayouts;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardLayout;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.DriverStation;
import frc.robot.OI;

public abstract class ShuffleLayout{
    public static void Init(){
     ShuffleboardTab Driver1 = Shuffleboard.getTab("Driver1 info");
     ShuffleboardTab Driver2 = Shuffleboard.getTab("Driver2 info");
     Driver1.getLayout("grid",BuiltInLayouts.kGrid);
     
     Driver1.addPersistent("controller1 X value",OI.controller1.getRawAxis(1))
    .withPosition(0, 1)
    .withSize(2, 1)
    .withWidget(BuiltInWidgets.kNumberBar)
    .getEntry();
    
// controoler y
   
   Driver1.addPersistent("Xbox Y value",OI.controller1.getRawAxis(4))
    .withPosition(0,2)
    .withSize(2, 1)
    .withWidget(BuiltInWidgets.kNumberBar)
    .getEntry();
//power 

  Driver1.addPersistent("power usage", OI.pdp)
   .withPosition(0, 3)
   .withSize(3, 2)
   .withWidget(BuiltInWidgets.kPowerDistributionPanel);
// rpm with mag encoders 
/*
   Shuffleboard.getTab("Test")
   .addPersistent("Drive train RPM",OI.rightFrontDriveMotor)
   .withPosition(9,4)
   .withSize(2,2)
   .withWidget(BuiltInWidgets.kDial);
   */
/*// pressure switch
   Shuffleboard.getTab("LiveWindow")
   .addPersistent("Pressure Switch",OI.pressureSwitch)
   .withPosition(9, 3)
   .withSize(2, 1)
   .withWidget(BuiltInWidgets.kBooleanBox);
   */
// shifter is active
    
    Driver1.addPersistent("Shifting",OI.shiftSolenoid)
    .withPosition(9,2)
    .withSize(2,1)
    .withWidget(BuiltInWidgets.kBooleanBox);
// graph of robot speed 
  
    Driver1.addPersistent("Accelleration graph",OI.accelerometer)
    .withPosition(4, 1)
    .withSize(4, 2)
    .withWidget(BuiltInWidgets.kGraph)
    .getEntry();
// 3 point acceleromitor 

    Driver1.addPersistent("axis acc",OI.accelerometer)
    .withPosition(9,1)
    .withSize(2,1)
    .withWidget(BuiltInWidgets.k3AxisAccelerometer)
    .getEntry();

// Adds Grip output to dashboard       

    Driver1.addPersistent("camera","GRIP/myContoursReport/streams<=mjpg:http://10.57.40.105:1181/?action=stream" )
    .withPosition(4,3)
    .withSize(4,3)
    .withWidget(BuiltInWidgets.kCameraStream)
    .getEntry();
    }
}