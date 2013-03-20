/**
 * 
 */
package abstractfactory;

/**
 * @author tianyi
 *
 */
public class NorthernGardener implements Gardener{
		/**
		 * 
		 * @param name
		 * @return
		 */
		public static Fruit createFruit(String name){
			return new NorthernFruit(name);
		}
		/**
		 * 
		 * @param name
		 * @return
		 */
		public static Veggie createVeggie(String name){
			return new NorthernVeggie(name);
		}
}
