/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.DoubleSolenoid;


import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;
import edu.wpi.first.wpilibj.interfaces.Gyro;

public class OI {
  public static PowerDistributionPanel pdp = new PowerDistributionPanel(RobotMap.pdpCAN);

  public static Joystick controller1 = new Joystick(RobotMap.controllerOnePort);
  public static Joystick controller2 = new Joystick(RobotMap.controllerTwoPort);

  public static WPI_TalonSRX leftFrontDriveMotor = new WPI_TalonSRX(RobotMap.leftFrontDriveCAN);
  public static WPI_TalonSRX leftCenterDriveMotor = new WPI_TalonSRX(RobotMap.leftCenterDriveCAN);
  public static WPI_TalonSRX leftBackDriveMotor = new WPI_TalonSRX(RobotMap.leftBackDriveCAN);
  public static WPI_TalonSRX rightFrontDriveMotor = new WPI_TalonSRX(RobotMap.rightFrontDriveCAN);
  public static WPI_TalonSRX rightCenterDriveMotor = new WPI_TalonSRX(RobotMap.rightCenterDriveCAN);
  public static WPI_TalonSRX rightBackDriveMotor = new WPI_TalonSRX(RobotMap.rightBackDriveCAN);


   // public static DoubleSolenoid leftRamp = new DoubleSolenoid(RobotMap.PCMTwoCAN, RobotMap.leftRampOne, RobotMap.leftRampTwo);
 // public static DoubleSolenoid rightRamp = new DoubleSolenoid(RobotMap.PCMTwoCAN, RobotMap.rightRampOne, RobotMap.rightRampTwo);
 /*
 public static DoubleSolenoid frontStiltRetract = new DoubleSolenoid(RobotMap.PCMTwoCAN, RobotMap.frontStiltRetractOne, RobotMap.frontStiltRetractTwo);
 public static DoubleSolenoid frontStiltExtend = new DoubleSolenoid(RobotMap.PCMTwoCAN,RobotMap.frontStiltExtendOne, RobotMap.frontStiltExtendTwo);
 public static DoubleSolenoid backStiltRetract = new DoubleSolenoid(RobotMap.PCMTwoCAN,RobotMap.backStiltRetractOne, RobotMap.backStiltRetractTwo);
 public static DoubleSolenoid backStiltExtend = new DoubleSolenoid(RobotMap.PCMTwoCAN, RobotMap.backStiltExtendOne, RobotMap.backStiltExtendTwo);
 */
public static DoubleSolenoid frontStilt = new DoubleSolenoid(14, 2, 3);
public static DoubleSolenoid backStilt = new DoubleSolenoid(14, 6, 7);

  public static SpeedControllerGroup leftDriveGroup = new SpeedControllerGroup( leftCenterDriveMotor, leftBackDriveMotor, leftFrontDriveMotor);
  public static SpeedControllerGroup rightDriveGroup = new SpeedControllerGroup(rightFrontDriveMotor, rightCenterDriveMotor, rightBackDriveMotor);
  public static DifferentialDrive drive = new DifferentialDrive(leftDriveGroup, rightDriveGroup);
  public static Solenoid shiftSolenoid = new Solenoid(RobotMap.PCMOneCAN, RobotMap.shiftSolenoid);
  public static Solenoid hatchActuateSolenoid = new Solenoid(RobotMap.PCMOneCAN, RobotMap.hatchActuate);
  public static Solenoid hatchTiltSolenoid = new Solenoid(RobotMap.PCMOneCAN, RobotMap.hatchTilt);

  //public static WPI_TalonSRX leftStiltRotate = new WPI_TalonSRX(RobotMap.stiltWheelsRotateLeftCAN);
  //spin stilt wheels (drive forward)
  //public static WPI_TalonSRX rightStiltRotate = new WPI_TalonSRX(RobotMap.stiltWheelsRotateRightCAN);
  //public static WPI_TalonSRX rightStiltActuate = new WPI_TalonSRX(RobotMap.stiltWheelsActuateRightCAN);
  //public static SpeedControllerGroup stiltRotateGroup = new SpeedControllerGroup(leftStiltRotate, rightStiltRotate);
  //public static SpeedControllerGroup stiltActuateGroup = new SpeedControllerGroup(leftStiltActuate, rightStiltActuate);

  public static VictorSP cargoArmActuateOne = new VictorSP(RobotMap.cargoArmActuateOnePWM);
  public static VictorSP cargoClawLeft = new VictorSP(RobotMap.cargoClawLeftRotatePWM);
  public static VictorSP cargoClawRight = new VictorSP(RobotMap.cargoClawRightRotatePWM);
  public static SpeedControllerGroup cargoIntake = new SpeedControllerGroup(cargoClawLeft, cargoClawRight);


  public static DigitalInput ballLimit = new DigitalInput(RobotMap.ballLimitDIO);
  public static Accelerometer accelerometer= new BuiltInAccelerometer(Accelerometer.Range.k4G);
  public static Compressor pressureSwitch = new Compressor();

  public static AnalogInput Pressureread= new AnalogInput(RobotMap.Pressure_read);
  public static ADXRS450_Gyro Balance = new ADXRS450_Gyro();
}

