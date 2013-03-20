/**
 * 
 */
package dispatch;

/**
 * @author chenminghao Jul 15, 2009 10:02:37 PM
 */
public class SubWestTwo extends West {

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern.dispatch.West#goWestOne(pattern.dispatch.SubEastOne)
	 */
	@Override
	public void goWestOne(SubEastOne east) {
		// TODO Auto-generated method stub
		System.out.println("SubWestTwo " + east.getName());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern.dispatch.West#goWestTwo(pattern.dispatch.SubEastTwo)
	 */
	@Override
	public void goWestTwo(SubEastTwo east) {
		// TODO Auto-generated method stub
		System.out.println("SubWestTwo " + east.getName());
	}

}
