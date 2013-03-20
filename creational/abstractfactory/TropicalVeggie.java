/**
 * 
 */
package abstractfactory;

/**
 * @author tianyi
 *
 */
public class TropicalVeggie implements Veggie{
	private String name;
	/**
	 * 
	 * @param name
	 */
	public TropicalVeggie(String name){
		this.name= name;
		System.out.println("TropicalVeggie is constructing@");
	}
}
