/**
 * 
 */
package iterator.whitebox;

/**
 * @author tianyi
 * 2007-10-24
 * обнГ09:52:45
 */
public interface Iterator {
	/**
	 * go to the first place
	 *
	 */
	 void first();
	 /**
	  * go to the next place
	  *
	  */
	 void next();
	 /**
	  * 
	  * @return is or not the last element
	  */
	 boolean isDone();
	 /**
	  * 
	  * @return the current element
	  */
	 Object currentItem();
}
