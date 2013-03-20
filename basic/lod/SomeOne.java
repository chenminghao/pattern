/**
 * 
 */
package lod;

/**
 * @author chenminghao Feb 14, 2009 11:36:51 PM
 * Law of Demeter :LOD
 * Least KnowLedge Principle :
 *LKP 
 *Only talk to your immediate
 *friends Don't talk to strangers
 */
public class SomeOne {
	/**
	 * 
	 * 
	 * @param friend
	 */
	public void Operation1(Friend friend) {
		friend.Forward();
	}
}
