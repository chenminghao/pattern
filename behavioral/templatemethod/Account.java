/**
 * 
 */
package templatemethod;

/**
 * @author chenminghao
 * 2007-11-13
 * ����09:32:53
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
	 * �����߼��Ŀ�ܣ����ǽ����ݵľ��岽��ί�ɸ���ͬ�Ļ���������
	 * doCalculateInterestRate��doCalculateAccountType�������������
	 * ������ʵ��
	 * @return
	 */
	final public double caculateInterest(){
		double interestRate = doCalculateInterestRate();
		String accountType = doCalculateAccountType();
		double amount =this.calculateAmount(accountType, accountNumber);
		return interestRate*amount;
	}
}
