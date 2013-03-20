/**
 * 
 */
package structuralpattern.facade;

/**
 * @author tianyi
 * 2007-11-2
 * обнГ01:53:46
 */
public class Alarm {
	/**
	 * activate the sensor
	 *
	 */
	public void activate() {
		System.out.println("Activating the Alarm");
	}
	/**
	 * 
	 *
	 */
	public void deactivate(){
		System.out.println("Deactivating the Alarm");
	}
	/**
	 * trigger the sensor
	 *
	 */
	public void ring(){
		System.out.println("Ringing the Alarm");
	}
	/**
	 * trigger the sensor
	 *
	 */
	public void stopRing(){
		System.out.println("StopRing the Alarm");
	}
}
