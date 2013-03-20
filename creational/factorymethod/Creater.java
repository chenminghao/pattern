package factorymethod;
/**
 * this interface is abstract factory role
 * @author tianyi
 *
 */
public interface Creater {
	/**
	 * factory method so it suberclass must implements this method
	 * @return product
	 */
		public Product factory();
}
