package frc.robot.logging;

import java.sql.Driver;

import edu.wpi.first.wpilibj.Sendable;
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
    public static void init(){
        Shuffleboard.selectTab("Driver1 info");
        Driver1.getLayout("RoboLog",BuiltInLayouts.kGrid);
    // displays boolean and buttop press  
        Driver1.addPersistent("test",test)
        .withSize(1, 2)
        .withWidget(BuiltInWidgets.kBooleanBox)
        .getEntry();
    }
    public static void perodic(){
    // if button 2 is pressed 
        if (OI.controller1.getRawButtonPressed(2) == true){
          test = true;
        } 
        if(OI.controller1.getRawButtonReleased(2) == false){
         test = false;
        }
    }
}