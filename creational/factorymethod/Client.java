/**
 * 
 */
package factorymethod;

/**
 * @author tianyi
 *
 */
public class Client {
	private static Creater creater1Factory,creater2Factory;
	@SuppressWarnings("unused")
	private static Product product1,product2;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		creater1Factory = new Creater1Factory();
		product1 = creater1Factory.factory();
		creater2Factory = new Creater2Factory();
		product2= creater2Factory.factory();
	}

}
