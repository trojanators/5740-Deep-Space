package frc.robot.subsystems;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.apache.log4j.Logger;

public class Consolelog {
    Calendar cal = Calendar.getInstance();
      public  java.util.Date date = cal.getTime();
      public  DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

      public Logger logger = Logger.getLogger(Consolelog.class);

      public void main(String[] args) {   
      logger.info("===========================================");
      logger.info(" |               Robo-Logger              |");
      logger.info("===========================================");
      
      logger.info("Sorry communism faild reverting to Captializem");
    }
    
}