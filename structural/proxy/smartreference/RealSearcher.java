/**
 * 
 */
package proxy.smartreference;

/**
 * @author tianyi
 * 2007-11-2
 * обнГ02:29:42
 */
public class RealSearcher implements Searcher{
	/**
	 * 
	 *
	 */
	public RealSearcher(){
		
	}
	/**
	 * 
	 */
	public String doSearcher(String userId, String searchType) {
		// TODO Auto-generated method stub
		String sql = "select * from afd";
		//execute this sel statement and concatenate a result string
		return "result set";
	}

}
