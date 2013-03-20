/**
 * 
 */
package strategy;

/**
 * @author chenminghao
 * 2007-11-13
 * обнГ09:19:28
 */
public class Sorter {
  private SortStrattegy sortStrattegy;
  public void Sort(){
	  sortStrattegy.Sort();
  }

/**
 * @return the sortStrattegy
 */
public SortStrattegy getSortStrattegy() {
	return sortStrattegy;
}

/**
 * @param sortStrattegy the sortStrattegy to set
 */
public void setSortStrattegy(SortStrattegy sortStrattegy) {
	this.sortStrattegy = sortStrattegy;
}
  
}
