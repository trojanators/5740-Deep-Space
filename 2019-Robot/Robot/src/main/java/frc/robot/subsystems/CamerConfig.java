package frc.robot.subsystems;

import org.opencv.video.Video;
import org.opencv.videoio.VideoWriter;

import edu.wpi.cscore.MjpegServer;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.cscore.VideoSource;
import edu.wpi.first.cameraserver.CameraServer;

public class CamerConfig {
  public static UsbCamera Cam0 = CameraServer.getInstance().startAutomaticCapture(0);
  public static UsbCamera Cam1  = CameraServer.getInstance().startAutomaticCapture(1);
  
    public static void Config(){
  
  Cam0.setBrightness(10);
  Cam0.setFPS(15);
  Cam0.setExposureAuto();

  Cam1.setBrightness(10);
  Cam1.setFPS(15);
  Cam1.setExposureAuto();
    }
}