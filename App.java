package week5codingassignment;

public class App {

  public static void main(String[] args) {

    Logger asteriskLogger = new AsteriskLogger();
    Logger spacedLogger = new SpacedLogger();
   
    asteriskLogger.Log("Supercalafragilisticexpealidocious");
    asteriskLogger.Error("Turn back now!");
    
    spacedLogger.Log("Charly");
    spacedLogger.Error("Sorry Charly");
    

  }

}
