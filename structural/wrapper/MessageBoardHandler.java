/**
 * 
 */
package wrapper;

/**
 * 用户留言板处理的接口 
 * @author chenminghao
 * Dec 29, 2009
 * 5:46:28 PM
 */
public interface MessageBoardHandler {
	/**
	 * 用户可以利用函数留言 
	 * @param msg
	 * @return
	 */
	public String filter(String msg);
}
