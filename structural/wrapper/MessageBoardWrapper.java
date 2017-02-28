/**
 * 
 */
package wrapper;

/**
 * @author chenminghao
 * Dec 29, 2009
 * 5:53:44 PM
 */
public class MessageBoardWrapper implements MessageBoardHandler {
	private MessageBoardHandler handler ;
	/* (non-Javadoc)
	 * @see structuralpattern.wrapper.MessageBoardHandler#filter(java.lang.String)
	 */
	public String filter(String msg) {
		
		return handler.filter(msg);
	}
	public MessageBoardWrapper(MessageBoardHandler handler) {
		super();
		this.handler = handler;
	}
	
 
}
