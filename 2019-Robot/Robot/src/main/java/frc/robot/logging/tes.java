package frc.robot.logging;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import frc.robot.*;
public class tes {
static Boolean test = new Boolean(false);
    private static ShuffleboardTab tab = Shuffleboard.getTab("Vision");
    private static  NetworkTableEntry distanceEntry =
        tab.add("Distance to target", test)
           .getEntry();
           private static  NetworkTableEntry ls = 
    tab.add("anime",OI.controller1.getRawAxis(4))
    .withWidget(BuiltInWidgets.kNumberBar)
   .getEntry();

 private static  NetworkTableEntry wiii =
 tab.add("wii",OI.controller1.getRawAxis(5))
 .withWidget(BuiltInWidgets.kNumberBar)
.getEntry();

    public static void calculate() {
        if(OI.controller1.getRawButton(2) == true){
            test = true;
            System.out.println("true");
          } 
          if(OI.controller1.getRawButton(2) == false){
           test = false;
           System.out.println("false");
          }
      distanceEntry.setBoolean(test);
      ls.setDouble(OI.controller1.getRawAxis(4));
      wiii.setDouble(OI.controller1.getRawAxis(5));
    }
}