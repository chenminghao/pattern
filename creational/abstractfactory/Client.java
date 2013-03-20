/**
 * 
 */
package abstractfactory;

/**
 * @author tianyi
 *
 */
public class Client {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NorthernGardener northernGardener = new NorthernGardener();
		Fruit northernFruit = northernGardener.createFruit("northernfruit");
		Veggie northernVeggie = northernGardener.createVeggie("northernveggie");
	}

}
