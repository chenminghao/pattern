/**
 * 
 */
package factorymethod;

/**
 * @author tianyi
 *
 */
public class Apple implements Fruit{
	private int appleAge;
	
	/**
	 * @return the appleAge
	 */
	public int getAppleAge() {
		return appleAge;
	}

	/**
	 * @param appleAge the appleAge to set
	 */
	public void setAppleAge(int appleAge) {
		this.appleAge = appleAge;
	}

	public Apple(){
		System.out.println("Apple is constructing");
	}

	public void grow() {
		// TODO Auto-generated method stub
		System.out.println("Apple is growing");
	}

	public void harvest() {
		// TODO Auto-generated method stub
		System.out.println("Apple is harvesting");
	}

	public void plant() {
		// TODO Auto-generated method stub
		System.out.println("Apple is planting");
	}
	
}
