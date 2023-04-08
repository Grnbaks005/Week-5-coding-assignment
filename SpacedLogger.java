package week5codingassignment;

//SpacedLogger implements Logger interface
public class SpacedLogger implements Logger {

//This method overrides log of Logger()
  @Override
  public void Log(String log) {
    
    for(int i = 0; i < log.length(); i++) {
      System.out.print(log.charAt(i) + " "); //prints out index of characters length of log with space in between letters
    }     
      System.out.println();
    
  }

//This method overrides log of Logger()
  @Override
  public void Error(String error) {
    System.out.print("ERROR: ");
    for(int i = 0; i < error.length(); i++) {
      System.out.print(error.charAt(i) + " "); //prints out index of characters length of error with space in between letters

    }
      System.out.println();
  }
  

}
