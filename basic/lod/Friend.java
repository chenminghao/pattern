/**
 * 
 */
package lod;

/**
 * @author chenminghao Feb 14, 2009 11:46:47 PM
 * 
 */
public class Friend {
	private Stranger stranger = new Stranger();

	/**
	 * 该方法是转发方法,不应该设计为包含商业逻辑的代码，仅仅是为了转发方法
	 * 
	 */
	public void Forward() {
		stranger.Operation3();
	}
}
