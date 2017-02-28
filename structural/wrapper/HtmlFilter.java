/**
 * 
 */
package wrapper;

/**
 * @author chenminghao
 * Dec 29, 2009
 * 5:55:45 PM
 */
public class HtmlFilter extends MessageBoardWrapper {

	public HtmlFilter(MessageBoardHandler handler) {
		super(handler);
		System.out.println("htmlfileter create");
		
	}
    
	@Override
	public String filter(String msg) {
		
		String temp = super.filter(msg);
		temp = temp.replace("html", "");
		System.out.println(temp);
		return temp;
	}
	
	
}
