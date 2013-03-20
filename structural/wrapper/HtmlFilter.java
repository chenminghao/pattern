/**
 * 
 */
package wrapper;

/**
 * @author chenminghao
 * Dec 29, 2009
 * 5:55:45 PM
 */
public class HtmlFilter extends MessageBoardDecorator {

	public HtmlFilter(MessageBoardHandler handler) {
		super(handler);
		System.out.println("htmlfileter create");
		// TODO Auto-generated constructor stub
	}
    
	@Override
	public String filter(String msg) {
		// TODO Auto-generated method stub
		String temp = super.filter(msg);
		temp = temp + "^^¹ıÂËµôHTML±êÇ©!^^";
		return temp;
	}
	
	
}
