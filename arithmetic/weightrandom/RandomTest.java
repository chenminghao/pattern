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
		
		Thread.sleep(3000);
		for (int i = 0 ;i < 1000;i ++) {
		
		RandomThread clientThread = new RandomThread(i);
		clientThread.start();
		}

	}

}
