package com.tutorialspoint.java8.javaScript;

import java.io.File;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class BigDecimalEx {
  public static void main(String[] args) {
    ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
    ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
    try {
      File file = new File("bin/com/tutorialspoint/java8/javaScript/big-decimal.js");
      System.out.println("File path: " + file.getAbsolutePath());
       nashorn.eval(new FileReader(file));
    } catch(Exception e){
       System.out.println("Error executing script: "+ e.getLocalizedMessage());
    }
  }

}
