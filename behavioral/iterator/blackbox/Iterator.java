/**
 * 
 */
package iterator.blackbox;

/**
 * @author tianyi
 * 2007-10-26
 * ионГ12:32:58
 */
public interface Iterator {
	/**
	 * move to the first item
	 *
	 */
	void first();
	/**
	 * move to the next item
	 *
	 */
	void next();
	/**
	 * 
	 * @return true if the item is the last item
	 */
	boolean isDone();
	/**
	 * 
	 * @return the current item
	 */
	Object currentItem();
}
