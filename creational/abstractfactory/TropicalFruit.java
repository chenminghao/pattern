/**
 * 
 */
package abstractfactory;

/**
 * @author tianyi
 *
 */
public class TropicalFruit implements Fruit{
	private String name;
	/**
	 * 
	 * @param name
	 */
	public TropicalFruit(String name){
		this.name= name;
		System.out.println("TropicalFruit is constructing@");
	}
}
