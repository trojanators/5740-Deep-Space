package frc.robot.subsystems;
import frc.robot.OI;
public class Drivetrainlimit{

public static void Limit(){

OI.leftCenterDriveMotor.configPeakCurrentLimit(55, 10); /* 55 A */
OI.leftCenterDriveMotor.configPeakCurrentDuration(200, 10); /* 200ms */
OI.leftCenterDriveMotor.configContinuousCurrentLimit(50);

OI.rightCenterDriveMotor.configPeakCurrentLimit(55, 10);
OI.rightCenterDriveMotor.configPeakCurrentDuration(200, 10);
OI.rightCenterDriveMotor.configContinuousCurrentLimit(50);

    }
}