package frc.robot.subsystems;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.cameraserver.CameraServer;

public class CamerConfig {
    public static void Config(){
    UsbCamera Cam0 = CameraServer.getInstance().startAutomaticCapture(0);
  UsbCamera Cam1  = CameraServer.getInstance().startAutomaticCapture(1);
  
  Cam0.setBrightness(10);
  Cam0.setFPS(15);
  Cam0.setExposureAuto();

  Cam1.setBrightness(10);
  Cam1.setFPS(15);
  Cam1.setExposureAuto();
    }
}