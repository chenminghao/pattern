/**
 * 
 */
package facade;

/**
 * @author tianyi
 * 2007-11-2
 * ����01:40:48
 */
public class Client {
	private static SecurityFacade facde = new SecurityFacade();
	public static void main(String[] args){
		facde.deactivate();
	}
}
