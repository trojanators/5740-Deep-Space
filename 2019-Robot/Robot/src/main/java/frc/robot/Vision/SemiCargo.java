/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package frc.robot.Vision;

import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.NetworkTableValue;
import frc.robot.OI;
import frc.robot.subsystems.Cargo;
import frc.robot.subsystems.Hatch;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.NetworkTableEntry;

/**
 * Add your docs here.
 * SemiAuto is Great
 */
public class SemiCargo {
  public static Integer TARGET_DISTANCE = 1000;
  
  public static void Perodic() throws InterruptedException {
    NetworkTable table = NetworkTableInstance.getDefault().getTable("GRIP/myContoursReport");
    double[] xValues = table.getEntry("centerX").getValue().getDoubleArray(); 
    double[] yValues = table.getEntry("centerY").getValue().getDoubleArray();
    double distance = xValues[1] - xValues[0];
    if(xValues.length < 2 || yValues.length < 2) {
      while(distance < TARGET_DISTANCE) {
        OI.drive.arcadeDrive(0.5, 0);
        Cargo.actuateArm(1);
      }
      OI.drive.arcadeDrive(0, 0);
     
     if(OI.ballLimit.get() == true){
      Cargo.actuateClaw(1);
     }
     
     OI.ballLimit.wait(1000);
     
     if(OI.ballLimit.get() == false){
      Cargo.stopClaw();
     }
    
    }
  }   
}
