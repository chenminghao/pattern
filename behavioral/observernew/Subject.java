/**
 * 
 */
package observernew;

/**
 * @author chenminghao
 * Jul 21, 2010
 * 8:27:23 PM
 */
public interface Subject {
	public void addMoney(int money);
	public int getAddMoney();
	public void add(Observer observer);
	public void delete (Observer observer);
	public void notifyObservers();
}
