/**
 * 
 */
package observernew;

import java.util.Vector;

/**
 * @author chenminghao
 * Jul 21, 2010
 * 8:47:01 PM
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
		// TODO Auto-generated method stub
		observerVector.add(observer);
	}

	@Override
	public void delete(Observer observer) {
		// TODO Auto-generated method stub
		observerVector.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(int i = 0;i<observerVector.size();i++){
			Observer observer = (Observer)observerVector.get(i);
			observer.update(this);
		}
	}

	@Override
	public int getAddMoney() {
		// TODO Auto-generated method stub
		return this.money;
	}

}
