package proxy.smartreference;

/**
 * @author tianyi
 * 2007-11-2
 * обнГ11:29:27
 */
public class UsageLogger {
	private String userId;

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 
	 *
	 */
	public void save(){
		String sql = "insert into information";
		//execute
	}
	public void save(String userId){
		this.userId=userId;
		save();
	}
}
