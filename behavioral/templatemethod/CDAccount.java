/**
 * 
 */
package templatemethod;

/**
 * @author chenminghao
 * 2007-11-13
 * обнГ10:24:15
 */
public class CDAccount extends Account{

	@Override
	protected String doCalculateAccountType() {
		// TODO Auto-generated method stub
		return "CDAccount";
	}

	@Override
	protected double doCalculateInterestRate() {
		// TODO Auto-generated method stub
		return 0.065D;
	}

}
