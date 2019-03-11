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
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

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

public class OI {
  public static PowerDistributionPanel pdp = new PowerDistributionPanel(RobotMap.pdpCAN);

  public static Joystick controller1 = new Joystick(RobotMap.controllerOnePort);
  public static Joystick controller2 = new Joystick(RobotMap.controllerTwoPort);

  public static WPI_VictorSPX leftFrontDriveMotor = new WPI_VictorSPX(RobotMap.leftFrontDriveCAN);
  public static WPI_TalonSRX leftCenterDriveMotor = new WPI_TalonSRX(RobotMap.leftCenterDriveCAN);
  public static WPI_VictorSPX leftBackDriveMotor = new WPI_VictorSPX(RobotMap.leftBackDriveCAN);
  public static WPI_VictorSPX rightFrontDriveMotor = new WPI_VictorSPX(RobotMap.rightFrontDriveCAN);
  public static WPI_TalonSRX rightCenterDriveMotor = new WPI_TalonSRX(RobotMap.rightCenterDriveCAN);
  public static WPI_VictorSPX rightBackDriveMotor = new WPI_VictorSPX(RobotMap.rightBackDriveCAN);


   // public static DoubleSolenoid leftRamp = new DoubleSolenoid(RobotMap.PCMTwoCAN, RobotMap.leftRampOne, RobotMap.leftRampTwo);
 // public static DoubleSolenoid rightRamp = new DoubleSolenoid(RobotMap.PCMTwoCAN, RobotMap.rightRampOne, RobotMap.rightRampTwo);
 
 public static DoubleSolenoid frontStiltDown = new DoubleSolenoid(RobotMap.PCMTwoCAN, RobotMap.frontStiltDownOne, RobotMap.frontStiltDownTwo);
 public static DoubleSolenoid frontStiltUp = new DoubleSolenoid(RobotMap.PCMTwoCAN,RobotMap.frontStiltUpOne, RobotMap.frontStiltUpTwo);
 public static DoubleSolenoid backStiltDown = new DoubleSolenoid(RobotMap.PCMTwoCAN,RobotMap.backStiltDownOne, RobotMap.backStiltDownTwo);
 public static DoubleSolenoid backStiltUp = new DoubleSolenoid(RobotMap.PCMTwoCAN, RobotMap.backStiltUpOne, RobotMap.backStiltUpTwo);
 

  public static SpeedControllerGroup leftDriveGroup = new SpeedControllerGroup(leftFrontDriveMotor, leftCenterDriveMotor, leftBackDriveMotor);
  public static SpeedControllerGroup rightDriveGroup = new SpeedControllerGroup(rightFrontDriveMotor, rightCenterDriveMotor, rightBackDriveMotor);
  public static DifferentialDrive drive = new DifferentialDrive(leftDriveGroup, rightDriveGroup);
  public static Solenoid shiftSolenoid = new Solenoid(RobotMap.PCMOneCAN, RobotMap.shiftSolenoid);
  public static Solenoid hatchActuateSolenoid = new Solenoid(RobotMap.PCMOneCAN, RobotMap.hatchActuate);
  public static Solenoid hatchTiltSolenoid = new Solenoid(RobotMap.PCMOneCAN, RobotMap.hatchTilt);

  public static WPI_TalonSRX leftStiltRotate = new WPI_TalonSRX(RobotMap.stiltWheelsRotateLeftCAN); //spin stilt wheels (drive forward)
  public static WPI_TalonSRX leftStiltActuate = new WPI_TalonSRX(RobotMap.stiltWheelsActuateLeftCAN);
  public static WPI_VictorSPX rightStiltRotate = new WPI_VictorSPX(RobotMap.stiltWheelsRotateRightCAN);
  public static WPI_VictorSPX rightStiltActuate = new WPI_VictorSPX(RobotMap.stiltWheelsActuateRightCAN);
  public static SpeedControllerGroup stiltRotateGroup = new SpeedControllerGroup(leftStiltRotate, rightStiltRotate);
  public static SpeedControllerGroup stiltActuateGroup = new SpeedControllerGroup(leftStiltActuate, rightStiltActuate);

  public static CANSparkMax cargoArmActuateOne = new CANSparkMax(RobotMap.cargoArmActuateOneCAN, MotorType.kBrushless);
  public static CANSparkMax cargoArmActuateTwo = new CANSparkMax(RobotMap.cargoArmActuateTwoCAN, MotorType.kBrushless);
  public static TalonSRX cargoClawLeft = new TalonSRX(RobotMap.cargoClawLeftRotateCAN);
  public static TalonSRX cargoClawRight = new TalonSRX(RobotMap.cargoClawRightRotateCAN);
  public static DigitalInput cargoBallDigitalInput = new DigitalInput(RobotMap.CargoClawLimit);

  public static DoubleSolenoid frontStiltDown = new DoubleSolenoid(RobotMap.PCMTwoCAN, RobotMap.frontStiltDownOne, RobotMap.frontStiltDownTwo);
  public static DoubleSolenoid frontStiltUp = new DoubleSolenoid(RobotMap.PCMTwoCAN,RobotMap.frontStiltUpOne, RobotMap.frontStiltUpTwo);
  public static DoubleSolenoid backStiltDown = new DoubleSolenoid(RobotMap.PCMTwoCAN,RobotMap.backStiltDownOne, RobotMap.backStiltDownTwo);
  public static DoubleSolenoid backStiltUp = new DoubleSolenoid(RobotMap.PCMTwoCAN, RobotMap.backStiltUpOne, RobotMap.backStiltUpTwo);


  public static DigitalInput ballLimit = new DigitalInput(RobotMap.ballLimitDIO);
  public static Accelerometer accelerometer= new BuiltInAccelerometer(Accelerometer.Range.k4G);
  public static Compressor pressureSwitch = new Compressor();

  public static AnalogInput Pressureread= new AnalogInput(RobotMap.Pressure_read);
  
}

