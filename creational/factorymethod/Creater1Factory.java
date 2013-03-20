/**
 * 
 */
package factorymethod;

/**
 * @author tianyi
 *
 */
public class Creater1Factory implements Creater{
	/**
	 * factory method
	 */
	public Product factory() {
		return new CreateProduct1();
	}
}
