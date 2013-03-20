/**
 * 
 */
package chainofresponseibility;

/**
 * @author chenminghao
 * 2007-11-15
 * обнГ09:24:52
 */
public class Client {
	private static Handler one, two,three;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		one = new ConcreteHandler();
		two = new ConcreteHandler();
		three = new ConcreteHandler();
		one.setSuccessor(two);
		one.setName("one");
		two.setSuccessor(three);
		two.setName("two");
		three.setName("three");
		one.handleRequest();
	}

}
