/**
 * 
 */
package iterator.whitebox;

/**
 * @author tianyi
 * 2007-10-24
 * обнГ10:23:33
 */
public class ConcreteAggregate extends Aggregate{

	/* (non-Javadoc)
	 * @see com.cmhmaster.pattern.iterator.Aggregate#getIterator()
	 */
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(this);
	}
	private Object[] obj={"Monk Tang","Monkey","Pigsy","Sandy","Horse"};
	/**
	 * 
	 * @param index
	 * @return the element of index
	 */
	public Object getElement(int index) {
		if(index<obj.length){
			return obj[index];
		}else{
			return null;
		}
	}
	/**
	 * 
	 * @return the aggregate size
	 */
	public int getSixe(){
		return obj.length;
	}
	
}
