package headfirst.command.undo;

public class RemoteControlWithUndo {
  //Command slot;
  Command[] onCommands; //갯수를 정해놓아야함
  Command undoCommand;
  public RemoteControlWithUndo() {
    onCommands = new Command[7];
    //Null Object Pattern
    Command noCommand = new NoCommand();
    for (int i=0; i<7; i++) {
      onCommands[i] = noCommand ;
    }
    
    undoCommand = noCommand;
  }
  public void setCommand(int slot, Command c) {
    //slot = c;
    onCommands[slot] = c; 
  }
  public void onButtonWasPushed(int slot) {
    //slot.execute();
    onCommands[slot].execute();
    undoCommand = onCommands[slot];
  }
  
  public void undoButtonWasPushed() {
    undoCommand.undo();
  }
}