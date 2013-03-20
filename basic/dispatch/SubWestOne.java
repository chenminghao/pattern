/**
 * 
 */
package dispatch;

/**
 * @author chenminghao Jul 15, 2009 10:00:42 PM
 */
public class SubWestOne extends West {

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern.dispatch.West#goWestOne(pattern.dispatch.SubEastOne)
	 */
	@Override
	public void goWestOne(SubEastOne east) {
		// TODO Auto-generated method stub
		System.out.println("SubWestOne " + east.getName());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern.dispatch.West#goWestTwo(pattern.dispatch.SubEastTwo)
	 */
	@Override
	public void goWestTwo(SubEastTwo east) {
		// TODO Auto-generated method stub
		System.out.println("SubWestOne " + east.getName());
	}

}
