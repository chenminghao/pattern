/**
 * 
 */
package templatemethod;

/**
 * @author chenminghao
 * 2007-11-13
 * 下午09:32:53
 */
public abstract class Account {
	protected String accountNumber;
	/*
	 * default constructor method
	 */
	public Account(){
		accountNumber = null;
	}
	/**
	 * constructor method 
	 * @param accountNumber
	 */
	public Account(String accountNumber){
		this.accountNumber=accountNumber;
	}
	/**
	 * basic method 
	 * every class extends account must implements this method
	 * @return
	 */
	abstract protected String doCalculateAccountType();
	/**
	 * basic method 
	 * every class extends account must implements this method
	 * @return
	 */
	abstract protected double doCalculateInterestRate();
	/**
	 * retrieve amount form database with accountType and accountNumber
	 * @param accountType
	 * @param accountNumber
	 * @return
	 */
	final public double calculateAmount(String accountType,String accountNumber){
		//retrieve amount form database
		return 1000;
	}
	/**
	 * 顶级逻辑的框架，但是将内容的具体步骤委派给不同的基本方法，
	 * doCalculateInterestRate和doCalculateAccountType方法留给具体的
	 * 子类来实现
	 * @return
	 */
	final public double caculateInterest(){
		double interestRate = doCalculateInterestRate();
		String accountType = doCalculateAccountType();
		double amount =this.calculateAmount(accountType, accountNumber);
		return interestRate*amount;
	}
}
