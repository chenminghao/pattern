/**
 * 
 */
package wrapper;

/**
 * @author chenminghao
 * Dec 29, 2009
 * 5:48:17 PM
 */
public class wrapperTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageBoardHandler msg = new MessageBoard ();
		String ff = msg.filter("fff");
		System.out.println(ff);
		msg = new HtmlFilter(new SensitiveFilter(new MessageBoard()));
		ff = msg.filter("fff");
		System.out.println(ff);
	}

}
