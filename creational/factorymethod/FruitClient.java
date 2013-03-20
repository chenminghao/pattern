/**
 * 
 */
package factorymethod;

/**
 * @author tianyi
 *
 */
public class FruitClient {
	private static FruitFactory appleFactory,bananaFactory;
	private static Fruit apple,banana;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		appleFactory = new AppleFactory();
		apple = appleFactory.factory();
		apple.grow();
		apple.harvest();
		apple.plant();
		bananaFactory= new BananaFactory();
		banana = bananaFactory.factory();
		banana.grow();
		banana.harvest();
		banana.plant();
		
	}

}
