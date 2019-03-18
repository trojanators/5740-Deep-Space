package frc.robot.logging;

import edu.wpi.cscore.VideoSource;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInLayouts;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.ComplexWidget;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardLayout;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import frc.robot.subsystems.CamerConfig;

public class Viewshuffle {
      // created driver info tab - grid layout 
      public static ShuffleboardTab tab = Shuffleboard.getTab("CameraFeed");
      public static ShuffleboardLayout lay = tab.getLayout("CameraFeed", BuiltInLayouts.kGrid);
     
      private static ComplexWidget backCameraWidget = 
        lay.add("Back_Camera",CamerConfig.Cam0)
            .withPosition(0,0)
            .withSize(5,4)
            .withWidget(BuiltInWidgets.kCameraStream);

      private static ComplexWidget frontCameraWidget = 
        lay.add("Front_Camera",CamerConfig.Cam1)
            .withPosition(7,0)
            .withSize(3,4)
            .withWidget(BuiltInWidgets.kCameraStream);

      
}