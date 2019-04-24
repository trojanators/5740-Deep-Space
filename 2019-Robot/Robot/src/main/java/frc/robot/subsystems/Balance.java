package frc.robot.subsystems;

import frc.robot.OI;

public class Balance {
    public static void Init() {
        OI.Balance.calibrate();
    }

    public static void Perodic() {
        double angle = OI.Balance.getAngle();
        //double Kp = 0.03;
        //System.out.print(angle);
    }
}