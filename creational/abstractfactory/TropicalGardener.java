/**
 * 
 */
package abstractfactory;

/**
 * @author tianyi
 *
 */
public class TropicalGardener implements Gardener{
	/**
	 * 
	 * @param name
	 * @return
	 */
	public Fruit createFruit(String name){
		return new TropicalFruit(name);
	}
	/**
	 * 
	 * @param name
	 * @return
	 */
	public Veggie createVeggie(String name){
		return new TropicalVeggie(name);
	}
}
