package frc.robot.logging;

import java.lang.System.Logger;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public class ShuffleNetworkTable{
 public static void main(String[] args) {
        new ShuffleNetworkTable().run();
    }
    public void run(){
        NetworkTableInstance instance = NetworkTableInstance.getDefault();
        NetworkTable table =instance.getTable("/ShuffleBoard");
        instance.startClientTeam(5740);

        table.getInstance();
        table.getEntry("ButtonB");
     }
        
    }
}