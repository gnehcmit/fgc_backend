package com.fgc.tools;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ConsoleLog {
  private static DateFormat dateFormat;
  private static Date date;
  static {
    dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    date = new Date();
  }
  public static void println(String print) {
    printTime();
    System.out.println(print);
  }
  private static void printTime() {
    System.out.print(dateFormat.format(date) + ": ");
  }
  public static void errorPrint(String message) {
    printTime();
    System.err.println("ERROR: " + message);
  }
  public static void sqlErrorPrint(String message) {
    errorPrint("when query db, " + message);
  }
  public static void sqlErrorPrint(String statement, String strings) {
    String message = "statement = " + statement + "with string = " + strings;
    sqlErrorPrint(message);
  }
}
