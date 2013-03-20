package iterator.whitebox;

public class ConcreteIterator implements Iterator {
	private ConcreteAggregate agg;
	private int index;
	private int size;
	public ConcreteIterator(ConcreteAggregate agg){
		this.agg=agg;
		this.index=0;
		size = agg.getSixe();
	}
	public Object currentItem() {
		// TODO Auto-generated method stub
		return agg.getElement(index);
	}

	public void first() {
		// TODO Auto-generated method stub
		index = 0;
	}
	/**
	 * false if the element is not the lase object
	 */
	public boolean isDone() {
		// TODO Auto-generated method stub
		return (index>=size);
	}
	/**
	 * 
	 */
	public void next() {
		// TODO Auto-generated method stub
		if(index<size){
			index++;
		}
	}

}
