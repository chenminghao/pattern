/**
 * 
 */
package simple;
/**
 * @author Administrator
 *
 */
public class EagerSingleton {
	
	private static final EagerSingleton my_instance= new EagerSingleton();
	/**
	 *
	 */
	private EagerSingleton(){
		
	}
	/**
	 * @return my_instance
	 */
	public static EagerSingleton getInstance(){
		return my_instance;
	}
}
