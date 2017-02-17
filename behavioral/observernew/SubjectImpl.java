/**
 * 
 */
package observernew;

import java.util.Vector;

/**
 * @author chenminghao
 * Jul 21, 2010
 * 8:47:01 PM
 * "-server -Xms2048m -Xmx2048m"
 */
public class SubjectImpl implements Subject{
	private int money = 0;
	private Vector observerVector = new java.util.Vector();
	public void addMoney(int money){
		this.money = money;
		String sql = "update set money  = "+this.money;
		this.notifyObservers();
	}
	@Override
	public void add(Observer observer) {
		
		observerVector.add(observer);
	}

	@Override
	public void delete(Observer observer) {
		
		observerVector.remove(observer);
	}

	@Override
	public void notifyObservers() {
		
		for(int i = 0;i<observerVector.size();i++){
			Observer observer = (Observer)observerVector.get(i);
			observer.update(this);
		}
	}

	@Override
	public int getAddMoney() {
		
		return this.money;
	}

}
