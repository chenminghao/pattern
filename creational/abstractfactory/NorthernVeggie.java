/**
 * 
 */
package abstractfactory;

/**
 * @author tianyi
 *
 */
public class NorthernVeggie implements Veggie{
	private String name;
	/**
	 * 
	 * @param name
	 */
	public NorthernVeggie(String name){
		this.name= name;
		System.out.println("NorthernVeggie is constructing#");
	}
}
