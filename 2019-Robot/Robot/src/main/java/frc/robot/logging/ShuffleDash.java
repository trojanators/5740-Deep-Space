package frc.robot.logging;

import java.sql.Driver;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInLayouts;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.OI;

public abstract class ShuffleDash {
    static  ShuffleboardTab Driver1 = Shuffleboard.getTab("Driver1 info");
    static Boolean test= new Boolean(false);
    
    // init button test
    public static  void init(){
    
        Shuffleboard.selectTab("Driver1 info");
        
        Driver1.getLayout("RoboLog",BuiltInLayouts.kGrid);
       
         NetworkTableEntry distanceEntry =
      Driver1.add("Distance to target", test)
         .getEntry();
  

    }
    public static void perodic(){
    // if button 2 is pr

        if(OI.controller1.getRawButton(2) == true){
          test = true;
          System.out.println("true");
        } 
        if(OI.controller1.getRawButton(2) == false){
         test = false;
         System.out.println("false");
        }
        Shuffleboard.update();
    
    }
}