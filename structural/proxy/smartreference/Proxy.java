package proxy.smartreference;


/**
 * @author tianyi
 * 2007-11-2
 * ÏÂÎç11:45:10
 */
public class Proxy implements Searcher{
	private RealSearcher realSearcher;
	private AccessValidator accessValidator;
	private UsageLogger usageLogger;
	/**
	 * 
	 *
	 */
	public Proxy(){
		realSearcher = new RealSearcher();
	}
	public String doSearcher(String userId, String searchType) {
		// TODO Auto-generated method stub
		if(checkAccess(userId)){	
			
			String string = realSearcher.doSearcher(userId, searchType);
			logUsage(userId);
			return string;
		}else{
			return null;
		}
	}
	/**
	 * 
	 * @param userId
	 * @return
	 */
	private boolean checkAccess(String userId){
		accessValidator = new AccessValidator();
		return accessValidator.validateUser(userId);
	}
	/**
	 * 
	 * @param userId
	 */
	private void logUsage(String userId){
		usageLogger=new UsageLogger();
		usageLogger.setUserId(userId);
		usageLogger.save(userId);
	}
}
