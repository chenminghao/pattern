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
		Observer o1 = new ObserverImpl("cmh1");
		Observer o2 = new ObserverImpl("cmh2");
		s.add(o1);
		s.add(o2);
		s.addMoney(100);
	}

}
