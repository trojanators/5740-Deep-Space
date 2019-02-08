package frc.robot.logging;

import java.lang.System.Logger;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.vision.VisionRunner.Listener;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.tables.ITableListener;

public class ShuffleNetworkTable {
    public static void run(){
        NetworkTableInstance instance = NetworkTableInstance.getDefault();
        NetworkTable table =instance.getTable("Root");
        instance.startClientTeam(5740);
        table.getEntry("ButtonB");
               
    }
}