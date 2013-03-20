/**
 * 
 */
package factorymethod;

/**
 * @author tianyi
 *
 */
public class Creater2Factory implements Creater{
	/**
	 * factory method
	 */
	public Product factory() {
		return new CreateProduct2();
	}
}
