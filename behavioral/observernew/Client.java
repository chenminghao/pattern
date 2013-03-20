/**
 * 
 */
package observernew;

/**
 * @author chenminghao
 * Jul 21, 2010
 * 9:21:11 PM
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject s = new SubjectImpl();
		Observer o = new ObserverImpl();
		s.add(o);
		s.addMoney(100);
	}

}
