/**
 * 
 */
package prototype;

/**
 * @author tianyi
 * 2007-11-8
 * ÏÂÎç08:46:43
 */
public class GoldRingsStaff {
	//height of goldRingsstaff
	private float height = 100.0F;
	//diameter of goldRingsstaff
	private float diameter = 10.0F;
	/**
	 * consturctor method
	 *
	 */
	public GoldRingsStaff(){
		
	}
	/**
	 * this method will make goldRingsStaff's height and 
	 * diameter two times more than before
	 *
	 */
	public void grow(){
		this.height=2*(this.height);
		this.diameter=2*(this.diameter);
	}
	/**
	 * @return the diameter
	 */
	public float getDiameter() {
		return diameter;
	}
	/**
	 * @param diameter the diameter to set
	 */
	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}
	/**
	 * @return the height
	 */
	public float getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(float height) {
		this.height = height;
	}
	
}
