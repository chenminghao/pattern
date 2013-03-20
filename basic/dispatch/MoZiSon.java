/**
 * 
 */
package dispatch;

/**
 * @author chenminghao Jul 14, 2009 9:12:45 PM
 */
public class MoZiSon extends MoZi {
	public void dost() {
		System.out.println("mozison!");
	}

	// overloading method
	public void ride(Horse h) {
		System.out.println(" mozison horse is riding@");
	}

	// overloading method
	public void ride(BlackHorse h) {
		System.out.println(" mozison BlackHorse is riding@");
	}

	// overloading method
	public void ride(WhiteHorse h) {
		System.out.println(" mozison WhiteHorse is riding@");
	}

	public void dost(int i) {

		System.out.println("Welcome Son! int = " + i);

	}

	public void dost(String s, int i) {

		System.out.println("Welcome Son! String = " + s + " int = " + i);

	}
}
