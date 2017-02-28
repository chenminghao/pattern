/**
 * 
 */
package facade;

/**
 * @author tianyi
 * 2007-11-2
 * ����01:48:12
 */
public class Sensor {
	/**
	 * activate the sensor
	 *
	 */
	public void activate() {
		System.out.println("Activating the sensor");
	}
	/**
	 * 
	 *
	 */
	public void deactivate(){
		System.out.println("Deactivating the sensor");
	}
	/**
	 * trigger the sensor
	 *
	 */
	public void trigger(){
		System.out.println("Triggering the sensor");
	}
}
