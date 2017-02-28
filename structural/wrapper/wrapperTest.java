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
		
		MessageBoardHandler msg = new MessageBoard ();
		msg.filter("fffhtmlfuck");
		
		msg = new SensitiveFilter(new MessageBoard());
		msg.filter("fffhtmlfuck");
		
		msg = new HtmlFilter(new SensitiveFilter(new MessageBoard()));
		msg.filter("fffhtmlfuck");
		
	}

}
