/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  public static int pdpCAN = 6;
  public static int controllerOnePort = 0;
  public static int controllerTwoPort = 1;

  public static int leftFrontDrivePWM = 0; //TODO: change PWM to CAN
  public static int leftCenterDrivePWM = 1;
  public static int leftBackDrivePWM = 2;
  public static int rightFrontDrivePWM = 3;
  public static int rightCenterDrivePWM = 4;
  public static int rightBackDrivePWM = 5;

  public static int shiftSolenoidOne = 0;
  public static int shiftSolenoidTwo = 1;
  public static int hatchActuateOne = 2;
  public static int hatchActuateTwo = 3;
  public static int hatchTiltOne = 4;
  public static int hatchTiltTwo = 5;
/*Undefined?
  public static int stiltWheelsRotateLeftCAN = 6; //rotate the wheels
  public static int stiltWheelsRotateRightCAN = 7;
  public static int stiltWheelsActuateLeftCAN = 8; //spin the wheels (drive forward)
  public static int stiltWheelsActuateRightCAN = 9;
 */ 
  public static int cargoArmActuateCAN = 10;
  public static int cargoClawLeftRotateCAN = 11;
  public static int cargoClawRightRotateCAN = 12;

  public static int PCMOneCAN = 13;
  public static int PCMTwoCAN = 14;

  public static int rightStickX = 4;
  public static int aButton = 1;
  public static int bButton = 2;
  public static int leftTrigger = 2;
  public static int leftStickY = 1;
  public static int rightTrigger = 3;
  public static int leftBumper = 5;
  public static int rightBumper = 6;
}

