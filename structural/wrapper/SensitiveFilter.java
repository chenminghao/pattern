/**
 * 
 */
package wrapper;

/**
 * @author chenminghao
 * Dec 29, 2009
 * 5:59:53 PM
 */
public class SensitiveFilter extends MessageBoardDecorator {

	public SensitiveFilter(MessageBoardHandler handler) {
		super(handler);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String filter(String msg) {
		// TODO Auto-generated method stub
		String temp = super.filter(msg);
		temp = temp + "^^过滤掉政治敏感的字眼!^^";
		return temp;
	}
	
}
