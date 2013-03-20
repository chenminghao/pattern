package command;

public class Invoker {

  private Command command;

  public  Invoker(Command con) {
     this.command = con;
  }

  public void action() {
	    command.excute();
  }
}