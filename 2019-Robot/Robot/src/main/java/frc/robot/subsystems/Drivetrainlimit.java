package frc.robot.subsystems;
import frc.robot.OI;
public class Drivetrainlimit{

public static void Limit(){
  
    OI.leftCenterDriveMotor.enableCurrentLimit(true);
    OI.leftCenterDriveMotor.configContinuousCurrentLimit(40);
    OI.leftCenterDriveMotor.configPeakCurrentDuration(50);
    OI.leftCenterDriveMotor.configPeakCurrentLimit(60);

    OI.rightCenterDriveMotor.enableCurrentLimit(true);
    OI.rightCenterDriveMotor.configContinuousCurrentLimit(40);
    OI.rightCenterDriveMotor.configPeakCurrentDuration(50);
    OI.rightCenterDriveMotor.configPeakCurrentLimit(60);

    OI.leftBackDriveMotor.enableCurrentLimit(true);
    OI.leftBackDriveMotor.configContinuousCurrentLimit(40);
    OI.leftBackDriveMotor.configPeakCurrentDuration(50);
    OI.leftBackDriveMotor.configPeakCurrentLimit(60);

    OI.rightBackDriveMotor.enableCurrentLimit(true);
    OI.rightBackDriveMotor.configContinuousCurrentLimit(40);
    OI.rightBackDriveMotor.configPeakCurrentDuration(50);
    OI.rightBackDriveMotor.configPeakCurrentLimit(60);

    OI.rightFrontDriveMotor.enableCurrentLimit(true);
    OI.rightFrontDriveMotor.configContinuousCurrentLimit(40);
    OI.rightFrontDriveMotor.configPeakCurrentDuration(50);
    OI.rightFrontDriveMotor.configPeakCurrentLimit(60);

    OI.leftFrontDriveMotor.enableCurrentLimit(true);
    OI.leftFrontDriveMotor.configContinuousCurrentLimit(40);
    OI.leftFrontDriveMotor.configPeakCurrentDuration(50);
    OI.leftFrontDriveMotor.configPeakCurrentLimit(60);
    }
} 