/**
 * 
 */
package proxy;

/**
 * @author tianyi
 * 2007-10-26
 * ионГ11:34:57
 */
public class ProxySubject extends Subject{
	private RealSubject realSubject;
	public ProxySubject() {
	}

	@Override
	public void request() {
		// TODO Auto-generated method stub
		preRequest();
		if(realSubject==null){
			realSubject = new RealSubject();
		}
		realSubject.request();
		postRequest();
	}
	public  void preRequest(){
		
	}
	public  void postRequest(){
		
	}
}
