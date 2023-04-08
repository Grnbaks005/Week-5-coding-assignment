package week5codingassignment;

  // AsteriskLogger implements Logger interface
public class AsteriskLogger implements Logger {

  // This method overrides log of Logger()
  @Override 
  public void Log(String log) {
    // prints out *** Supercalafragilisticexpealidocious ***
   System.out.println("*** " + log + " ***");
  }

//This method overrides error of Logger()
  @Override
  public void Error(String error) {
    
    int ast1 = error.length() + 13;
    String ast2 = "*".repeat(ast1); // will repeat String "*" with ast1 passed in to repeat method.
    System.out.println(ast2); // prints out 27 asterisks
    System.out.println("***ERROR: " + error + "***");
    System.out.println(ast2); // prints out 27 asterisks

    
  }
  
    
}// end of class
