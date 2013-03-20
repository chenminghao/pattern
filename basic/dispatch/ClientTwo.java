/**
 * 
 */
package dispatch;

/**
 * @author chenminghao Jul 15, 2009 10:04:13 PM
 */
public class ClientTwo {
	private static East east;
	private static West west;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		east = new SubEastOne();
		west = new SubWestOne();
		east.goEast(west);
		east = new SubEastOne();
		west = new SubWestTwo();
		east.goEast(west);
	}

}
