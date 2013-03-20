/**
 * 
 */
package factorymethod;

/**
 * @author tianyi
 *
 */
public class AppleFactory implements FruitFactory{
	/**
	 * factory method for creating applefruit
	 */
	public Fruit factory(){
		return new Apple();
	}
}
