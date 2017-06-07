package headfirst.command.undo;

public class NoCommand implements Command {
  
  public void execute() {
    System.out.println("Do nothing...");
  }
  
  public void undo() {}
}