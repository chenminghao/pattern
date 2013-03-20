/**
 * 
 */
package proxy.smartreference;

/**
 * @author tianyi
 * 2007-11-2
 * ÏÂÎç11:27:40
 */
public class AccessValidator {
	/**
	 * user validate is here
	 * @param userId
	 * @return
	 */
		public boolean validateUser(String userId){
			if(userId.equals("Admin")){
				return true;
			}else {
				return false;
			}
		}
}
