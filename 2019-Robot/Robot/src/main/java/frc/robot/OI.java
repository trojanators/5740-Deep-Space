/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;

public class OI {
  public static PowerDistributionPanel pdp = new PowerDistributionPanel(RobotMap.pdpCAN);

  public static Joystick controller1 = new Joystick(RobotMap.controllerOnePort);
  public static Joystick controller2 = new Joystick(RobotMap.controllerTwoPort);

  public static WPI_VictorSPX leftFrontDriveMotor = new WPI_VictorSPX(RobotMap.leftFrontDrivePWM);
  public static WPI_TalonSRX leftCenterDriveMotor = new WPI_TalonSRX(RobotMap.leftCenterDrivePWM);
  public static WPI_VictorSPX leftBackDriveMotor = new WPI_VictorSPX(RobotMap.leftBackDrivePWM);
  public static WPI_VictorSPX rightFrontDriveMotor = new WPI_VictorSPX(RobotMap.rightFrontDrivePWM);
  public static WPI_TalonSRX rightCenterDriveMotor = new WPI_TalonSRX(RobotMap.rightCenterDrivePWM);
  public static WPI_VictorSPX rightBackDriveMotor = new WPI_VictorSPX(RobotMap.rightBackDrivePWM);

  public static SpeedControllerGroup leftDriveGroup = new SpeedControllerGroup(leftFrontDriveMotor, leftCenterDriveMotor, leftBackDriveMotor);
  public static SpeedControllerGroup rightDriveGroup = new SpeedControllerGroup(rightFrontDriveMotor, rightCenterDriveMotor, rightBackDriveMotor);
  public static DifferentialDrive drive = new DifferentialDrive(leftDriveGroup, rightDriveGroup);
/*
  public static DoubleSolenoid shiftSolenoid = new DoubleSolenoid(RobotMap.PCMOneCAN, RobotMap.shiftSolenoidOne, RobotMap.shiftSolenoidTwo);
  public static DoubleSolenoid hatchActuateSolenoid = new DoubleSolenoid(RobotMap.PCMOneCAN, RobotMap.hatchActuateOne,  RobotMap.hatchActuateTwo);
  public static DoubleSolenoid hatchTiltSolenoid = new DoubleSolenoid(RobotMap.PCMOneCAN, RobotMap.hatchTiltOne, RobotMap.hatchTiltTwo);
  
  public static TalonSRX leftStiltRotate = new TalonSRX(RobotMap.stiltWheelsRotateLeftCAN); //spin stilt wheels (drive forward)
  public static TalonSRX leftStiltActuate = new TalonSRX(RobotMap.stiltWheelsActuateLeftCAN);
  public static TalonSRX rightStiltRotate = new TalonSRX(RobotMap.stiltWheelsRotateRightCAN);
  public static TalonSRX rightStiltActuate = new TalonSRX(RobotMap.stiltWheelsActuateRightCAN);

  public static TalonSRX cargoArmActuate = new TalonSRX(RobotMap.cargoArmActuateCAN);
  public static TalonSRX cargoClawLeft = new TalonSRX(RobotMap.cargoClawLeftRotateCAN);
  public static TalonSRX cargoClawRight = new TalonSRX(RobotMap.cargoClawRightRotateCAN);

  public static Accelerometer accelerometer= new BuiltInAccelerometer();
*/
}