/**
 * 
 */
package wrapper;

/**
 * @author chenminghao
 * Dec 29, 2009
 * 5:59:53 PM
 */
public class SensitiveFilter extends MessageBoardWrapper {

	public SensitiveFilter(MessageBoardHandler handler) {
		super(handler);
		
	}

	@Override
	public String filter(String msg) {
		
		String temp = super.filter(msg);
		temp = temp.replace("fuck", "");
		System.out.println(temp);
		return temp;
	}
	
}
