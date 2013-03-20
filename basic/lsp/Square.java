/**
 * 
 */
package lsp;

/**
 * @author tianyi
 * 
 */
public class Square extends Rectangle {
	private long side;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.my.cmhmaster.pattern.lsp.Rectangle#getHeight()
	 */
	@Override
	public long getHeight() {
		// TODO Auto-generated method stub
		return getSide();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.my.cmhmaster.pattern.lsp.Rectangle#getWidth()
	 */
	@Override
	public long getWidth() {
		// TODO Auto-generated method stub
		return getSide();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.my.cmhmaster.pattern.lsp.Rectangle#setHeight(long)
	 */
	@Override
	public void setHeight(long height) {
		// TODO Auto-generated method stub
		setSide(height);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.my.cmhmaster.pattern.lsp.Rectangle#setWidth(long)
	 */
	@Override
	public void setWidth(long width) {
		// TODO Auto-generated method stub
		setSide(width);
	}

	/**
	 * @return the side
	 */
	public long getSide() {
		return side;
	}

	/**
	 * @param side
	 *            the side to set
	 */
	public void setSide(long side) {
		this.side = side;
	}

}
