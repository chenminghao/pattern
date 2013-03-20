/**
 * 
 */
package dispatch;

/**
 * @author chenminghao Jul 14, 2009 8:45:24 PM
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Horse wh = new WhiteHorse();
		Horse bh = new BlackHorse();
		MoZi mozi = new MoZi();
		// static dispatch
		mozi.ride(bh);
		// static dispatch
		mozi.ride(wh);
		// s1 static type is String
		String s1 = "ab";
		// o static type is Object
		Object o = s1 + "c";
		// s static type is String
		String s = "abc";
		System.out.println(o.equals(s));
		MoZi mozison = new MoZiSon();
		mozi.dost();
		mozison.dost();
		mozi.ride(bh);
		mozison.ride(bh);
		mozi.dost(1);
		mozison.dost(4);

	}

}
