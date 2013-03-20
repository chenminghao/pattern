/**
 * 
 */
package templatemethod;

/**
 * @author chenminghao
 * 2007-11-13
 * обнГ10:25:09
 */
public class Client {
	private static Account account = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		account= new MoneyMarketAccount();
		System.out.println("MoneyMarketAccount "+account.caculateInterest());
		
		account= new CDAccount();
		
		System.out.println("CDAccount "+account.caculateInterest());
	}

}
