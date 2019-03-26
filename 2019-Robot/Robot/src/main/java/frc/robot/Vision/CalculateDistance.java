package frc.robot.Vision;

import java.util.TimerTask;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.NetworkTableValue;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;

public class CalculateDistance {
    public static NetworkTable table = NetworkTableInstance.getDefault().getTable("GRIP/myContoursReport");
   
    public static void execute() {
        double[] xValues = table.getEntry("centerX").getValue().getDoubleArray(); 
        double distanceBetween = xValues[0] - xValues[1];
        System.out.println("Distance between targets: " + Double.toString(distanceBetween) + " pixels");
        double exponential = Math.pow(.987198, distanceBetween);
        double distanceToTarget = (71.657 * exponential);
        System.out.println("Distance to Target" + Double.toString(distanceToTarget) + " inches");
    }
}