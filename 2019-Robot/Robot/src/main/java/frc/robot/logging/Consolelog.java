package frc.robot.logging;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.apache.log4j.Logger;
import org.apache.logging.log4j.core.appender.FileAppender;

import frc.robot.Robot;

public class Consolelog {

    Calendar cal = Calendar.getInstance();
      public  java.util.Date date = cal.getTime();
      public  DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

      public static Logger Robologger = Logger.getLogger(Consolelog.class);
     
      public void main(String[] args) {   
    Robologger.info("===========================================");
    Robologger.info(" |               Robo-Logger              |");
    Robologger.info("===========================================");
    Robologger.info("");
    Robologger.info("Sorry communism faild reverting to Captializem");
    Robologger.info("");
    Robologger.info("Date:"+date);
    Robologger.info("");
      
      }
}