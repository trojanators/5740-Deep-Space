package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Timer;
import frc.robot.OI;
import frc.robot.RobotMap;

public class Cargo {
  private static Timer cargoTimer = new Timer();
  private static double buffer = .5;
  private static double timeToStop;
  private static boolean hasBall = false;
  private static boolean stowed = false;
  private static boolean intaking = false;
  public Cargo() {}
  public static void actuateArm(double speed) {
    OI.cargoArmActuateOne.set(speed);
  }
  public static void stopArm() {
    OI.cargoArmActuateOne.set(0);
  }
  public static void actuateClaw(double speed) {
    OI.cargoIntake.set(speed);
  }
  public static void stopClaw() {
    OI.cargoIntake.set(0);
  }
  public static void holdBall() {
    OI.cargoIntake.set(0.05);
  }
  public static void update() {
    hasBall = OI.ballLimit.get();
    if(hasBall && intaking) {
      //slowly run intake to secure ball
      if(cargoTimer.get() < timeToStop) {
        actuateClaw(0.2);
      } else {
        intaking = false;
        stowed = true;
      }
    } else if(hasBall && !intaking && stowed) {
      //run intake very slowly to keep ball in
      holdBall();
    } else if(hasBall && !intaking && !stowed) {
      //start the process to secure ball
      intaking = true;
      cargoTimer.reset();
      timeToStop = cargoTimer.get() + buffer;
    } else {
      //do nothing
      stopClaw();
    }
    if(OI.controller2.getRawButton(RobotMap.rightBumper) && !intaking && !hasBall && !stowed) {
      //run intake
      actuateClaw(0.5);
    }
  }
}