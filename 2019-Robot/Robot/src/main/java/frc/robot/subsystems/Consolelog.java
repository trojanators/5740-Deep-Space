package frc.robot.subsystems;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Consolelog{
public static void log(){
        Calendar cal = Calendar. getInstance();
        java.util.Date date=cal. getTime();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String formattedDate=dateFormat. format(date);
    
System.out.println("=======================================================");
System.out.println("|                     Robo-logger                     |");
System.out.println("=======================================================");
System. out. println("Current time: "+ formattedDate);
    }
}