/**
 * 
 */
package abstractfactory;

/**
 * @author tianyi
 *
 */
public class NorthernFruit implements Fruit{
		private String name;
		/**
		 * 
		 * @param name
		 */
		public NorthernFruit(String name){
			this.name= name;
			System.out.println("NorthernFruit is constructing@");
		}
}
