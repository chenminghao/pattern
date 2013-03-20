/**
 * 
 */
package chainofresponseibility;

/**
 * @author chenminghao
 * 2007-11-15
 * обнГ09:13:16
 */
public abstract class Handler {
	protected Handler successor;
	private String name ;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 *
	 */
	public abstract void handleRequest();
	/**
	 * set next successor
	 * @param successor
	 */
	public void setSuccessor(Handler successor){
		this.successor =successor;
	}
	/**
	 * 
	 * @return the successor
	 */
	public Handler getHandler(){
		return successor;
	}
}
