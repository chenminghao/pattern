/**
 * 
 */
package dispatch;

/**
 * @author chenminghao Jul 14, 2009 8:43:54 PM
 */
public class MoZi {
	public void dost() {
		System.out.println("mozi!");
	}

	// overloading method
	public void ride(Horse h) {
		System.out.println(" mozi horse is riding@");
	}

	// overloading method
	public void ride(BlackHorse h) {
		System.out.println(" mozi BlackHorse is riding@");
	}

	// overloading method
	public void ride(WhiteHorse h) {
		System.out.println(" moziWhiteHorse is riding@");
	}

	public void dost(int i) {

		System.out.println("Welcome Father! int = " + i);

	}

	public void dost(String s) {

		System.out.println("Welcome Father! String = " + s);

	}
}
