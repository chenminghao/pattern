/**
 * 
 */
package dispatch;

/**
 * @author chenminghao Jul 15, 2009 9:57:10 PM
 */
public class SubEastOne extends East {

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern.dispatch.East#goEast(pattern.dispatch.West)
	 */
	@Override
	public void goEast(West west) {
		// TODO Auto-generated method stub
		west.goWestOne(this);
	}

	//	
	public String getName() {
		return "sub east one";
	}
}
