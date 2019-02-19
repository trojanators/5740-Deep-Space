package frc.robot.logging;

import java.sql.Driver;

import edu.wpi.first.wpilibj.DriverStation;
import frc.robot.Robot;

public class robotdect{
    public static void perodic(){
       if (Robot.eNABLEDBoolean == true){
        DriverStation.reportError("Im alive",Robot.eNABLEDBoolean);
        DriverStation.reportError("ROBOT", Robot.eNABLEDBoolean); 
       }
       else if (Robot.eNABLEDBoolean == false){
           DriverStation.reportError("Im dead", Robot.eNABLEDBoolean);
       }
    }
}