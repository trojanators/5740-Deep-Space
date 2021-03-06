package frc.robot.logging;

import java.util.Map;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInLayouts;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.ComplexWidget;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardLayout;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.shuffleboard.SimpleWidget;
import frc.robot.OI;
import frc.robot.Teleop;
import frc.robot.subsystems.CamerConfig;

public class SlimShuffle {

          // created driver info tab - grid layout 
          public static ShuffleboardTab tab = Shuffleboard.getTab("SlimShuffle");
          public static ShuffleboardLayout lay = tab.getLayout("SlimShuffle", BuiltInLayouts.kGrid);

        static  double text ;

      private static ComplexWidget backCameraWidget = 
      lay.add("Back_Camera",CamerConfig.Cam0)
          .withPosition(0,0)
          .withSize(3,4)
          .withWidget(BuiltInWidgets.kCameraStream);

    private static ComplexWidget frontCameraWidget = 
      lay.add("Front_Camera",CamerConfig.Cam1)
          .withPosition(7,0)
          .withSize(3,4)
          .withWidget(BuiltInWidgets.kCameraStream);

    
    private static NetworkTableEntry pressureStatusEntry = 
          lay.add ("Pressure",text)
          .withPosition(4,0)
          .withSize(3,3)
          .withWidget(BuiltInWidgets.kDial)
          .withProperties(Map.of("Min", "0", "Max", "125"))
          .getEntry();
         
     private static SimpleWidget shift= 
          lay.add("shift mode",Teleop.shift)
          .withPosition(4,6)
          .withSize(3,3)
          .withWidget(BuiltInWidgets.kBooleanBox);


          public static void Periodic()  {
            
            double averageVolts = OI.Pressureread.getAverageVoltage();
            double pressure = (250*(averageVolts/5.0))-25;
        

            pressureStatusEntry.setDouble(pressure);
            
          }

         
}