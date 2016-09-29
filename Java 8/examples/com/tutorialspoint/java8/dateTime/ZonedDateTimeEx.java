package com.tutorialspoint.java8.dateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeEx {
  public static void main(String args[]){
    ZonedDateTimeEx java8tester = new ZonedDateTimeEx();
    java8tester.testZonedDateTime();
 }

 public void testZonedDateTime(){

    // Get the current date and time
    ZonedDateTime date1 = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
    System.out.println("date1: " + date1);
  
    ZoneId id = ZoneId.of("Europe/Paris");
    System.out.println("ZoneId: " + id);
  
    ZoneId currentZone = ZoneId.systemDefault();
    System.out.println("CurrentZone: " + currentZone);
    
    LocalDateTime date2 = date1.toLocalDateTime();
    System.out.println("date2: " + date2);
    
    ZonedDateTime date3 = date1.withZoneSameInstant(currentZone);
    System.out.println("date3: " + date3);
    
    ZonedDateTime date4 = date1.withZoneSameLocal(currentZone);
    System.out.println("date4: " + date4);
 }
}
