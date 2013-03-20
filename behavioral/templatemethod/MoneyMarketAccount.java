/**
 * 
 */
package templatemethod;

/**
 * @author chenminghao
 * 2007-11-13
 * обнГ10:22:57
 */
public class MoneyMarketAccount extends Account{

	@Override
	protected String doCalculateAccountType() {
		// TODO Auto-generated method stub
		return "Money Marker";
	}

	@Override
	protected double doCalculateInterestRate() {
		// TODO Auto-generated method stub
		return 0.045D;
	}

}
