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
import frc.robot.subsystems.Hatch;

public abstract class ShuffleLayout{
    public static void Init(){
   /*     //TODO add an RPM counter to shuffleboard
// driver 1 tab 
     ShuffleboardTab Driver1 = Shuffleboard.getTab("Driver1 info");
// driver 2 tab
     ShuffleboardTab Driver2 = Shuffleboard.getTab("Driver2 info");
// sets layout grid layout      
     Driver1.getLayout("grid",BuiltInLayouts.kGrid);
     Driver2.getLayout("grid2",BuiltInLayouts.kGrid);

     Driver1.addPersistent("controller1 X value",OI.controller1.getRawAxis(1))
    .withPosition(1, 1)
    .withSize(2, 1)
    .withWidget(BuiltInWidgets.kNumberBar)
    .getEntry();
// xbox  
    Driver2.addPersistent("controller2 X value",OI.controller2.getRawAxis(1))
    .withPosition(0, 1)
    .withSize(2, 1)
    .withWidget(BuiltInWidgets.kNumberBar)
    .getEntry();
    
// controoler y
   
   Driver1.addPersistent("Controller 1 Y value",OI.controller1.getRawAxis(4))
    .withPosition(0,2)
    .withSize(2, 1)
    .withWidget(BuiltInWidgets.kNumberBar)
    .getEntry();
    
    Driver2.addPersistent("Controller 2, Y value",OI.controller2.getRawAxis(4))
    .withPosition(1,2)
    .withSize(2, 1)
    .withWidget(BuiltInWidgets.kNumberBar)
    .getEntry();
//power 

  Driver1.addPersistent("power usage", OI.pdp)
   .withPosition(0, 3)
   .withSize(3, 2)
   .withWidget(BuiltInWidgets.kPowerDistributionPanel)
   .getEntry();

   Driver2.addPersistent("power usage", OI.pdp)
   .withPosition(0, 3)
   .withSize(3, 2)
   .withWidget(BuiltInWidgets.kPowerDistributionPanel)
   .getEntry();

// Hatch deliver 

   Driver1.addPersistent("Hatch Deliver", OI.hatchActuateSolenoid)
   .withPosition(9, 3)
   .withSize(2, 1)
   .withWidget(BuiltInWidgets.kBooleanBox)
   .getEntry();

   Driver2.addPersistent("Hatch Deliver", OI.hatchActuateSolenoid)
   .withPosition(9, 3)
   .withSize(2, 1)
   .withWidget(BuiltInWidgets.kBooleanBox)
   .getEntry();
   
// shifter is active
    
    Driver1.addPersistent("Shifting",OI.shiftSolenoid)
    .withPosition(9,2)
    .withSize(2,1)
    .withWidget(BuiltInWidgets.kBooleanBox)
    .getEntry();

    Driver2.addPersistent("Shifting",OI.shiftSolenoid)
    .withPosition(9,2)
    .withSize(2,1)
    .withWidget(BuiltInWidgets.kBooleanBox)
    .getEntry();
// graph of robot speed 
  
    Driver1.addPersistent("Accelleration graph",OI.accelerometer)
    .withPosition(4, 1)
    .withSize(4, 2)
    .withWidget(BuiltInWidgets.kGraph)
    .getEntry();

    Driver2.addPersistent("Accelleration graph",OI.accelerometer)
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

    Driver2.addPersistent("axis acc",OI.accelerometer)
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

    Driver2.addPersistent("camera","GRIP/myContoursReport/streams<=mjpg:http://10.57.40.105:1181/?action=stream" )
    .withPosition(4,3)
    .withSize(4,3)
    .withWidget(BuiltInWidgets.kCameraStream)
    .getEntry();
    */
    }
}