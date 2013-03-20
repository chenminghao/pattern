/**
 * 
 */
package proxy.smartreference;

/**
 * @author tianyi
 * 2007-11-3
 * ионГ12:04:20
 */
public class Client {
	private static Searcher searcher;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		searcher=new Proxy();
		String userId="Admin";
		String searchType="sfsfs";
		String result=searcher.doSearcher(userId, searchType);
		System.out.println(result);
	}

}
