/**
 * 
 */
package factorymethod;

/**
 * @author tianyi
 *
 */
public class Banana implements Fruit{
	public Banana(){
		System.out.println("Banana is constructing");
	}

	public void grow() {
		// TODO Auto-generated method stub
		System.out.println("Banana is growing");
	}

	public void harvest() {
		// TODO Auto-generated method stub
		System.out.println("Banana is harvesting");
	}

	public void plant() {
		// TODO Auto-generated method stub
		System.out.println("Banana is planting");
	}
	
}
