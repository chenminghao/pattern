/**
 * 
 */
package proxy;

/**
 * @author tianyi
 * 2007-10-26
 * ионГ11:33:43
 */
public class RealSubject extends Subject{

	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("RealSubject is requesting@");
	}
	
}
