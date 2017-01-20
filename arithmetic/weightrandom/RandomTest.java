/**
 * 
 */
package weightrandom;

/**
 * @author cmh
 *
 */
public class RandomTest {
	
	
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		Thread.sleep(50000);
		for (int i = 0 ;i < 1000;i ++) {
		
		ClientThread clientThread = new ClientThread();
		clientThread.start();
		}

	}

}
