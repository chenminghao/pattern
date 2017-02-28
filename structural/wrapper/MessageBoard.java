package wrapper;

public class MessageBoard implements MessageBoardHandler {

	public String filter(String msg) {
		System.out.println(msg);
		return msg;
	}

}
