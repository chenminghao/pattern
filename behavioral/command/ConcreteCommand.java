package command;

public class ConcreteCommand implements Command {

  private Receiver receiver;

  public void excute() {
	  receiver.action();
  }

  public  ConcreteCommand(Receiver re ) {
	  this.receiver = re;
  }
}