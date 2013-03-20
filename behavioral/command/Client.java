/**
 * 
 */
package command;

/**
 * @author chenminghao
 * Aug 9, 2009
 * 12:46:40 AMX
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Receiver re = new Receiver();
    ConcreteCommand cc = new ConcreteCommand(re);
    Invoker in = new Invoker(cc);
    in.action();
	}

}
