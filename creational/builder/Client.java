/**
 * 
 */
package builder;

/**
 * @author Administrator
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Builder builder = new Builder();
		Product product = builder.makePerson();
		System.out.println(product.getName());
	}

}
