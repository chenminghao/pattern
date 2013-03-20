/**
 * 
 */
package dispatch;

/**
 * @author chenminghao Jul 15, 2009 9:57:31 PM
 */
public class SubEastTwo extends East {

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern.dispatch.East#goEast(pattern.dispatch.West)
	 */
	@Override
	public void goEast(West west) {
		// TODO Auto-generated method stub
		west.goWestTwo(this);
	}

	public String getName() {
		return "sub east two";
	}
}
