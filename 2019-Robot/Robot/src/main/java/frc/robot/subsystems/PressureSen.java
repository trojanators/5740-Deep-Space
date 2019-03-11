package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import frc.robot.OI;
import frc.robot.logging.SuperShuffle;
public class PressureSen {

   public static int raw =  OI.Pressureread.getValue();
   public static double volts = OI.Pressureread.getVoltage();
   public static int averageRaw = OI.Pressureread.getAverageValue();
  // public s double averageVolts = OI.Pressureread.getAverageVoltage();
   //public static double pressure = (250*(averageVolts/5.0))-25;

public static void Periodic(){
   double averageVolts = OI.Pressureread.getAverageVoltage();
   double pressure = (250*(averageVolts/5.0))-25;
  //// System.out.println("Average raw pressure :"+ averageRaw);
  // System.out.println("PowerUseage" +averageVolts);
  // System.out.println("air piressure :"+ pressure);
}
   
    }
