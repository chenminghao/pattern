/**
 * 
 */
package proxy;

/**
 * @author tianyi
 * 2007-10-26
 * обнГ01:00:46
 */
public class ReflectStudy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealSubject rs = new RealSubject();
		Class cla =rs.getClass();
		System.out.println(cla.toString());
		System.out.println(cla.getFields());
	}

}
