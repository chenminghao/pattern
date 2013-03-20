/**
 * 
 */
package iterator.blackbox;

/**
 * @author tianyi
 * 2007-10-26
 * ÉÏÎç12:37:36
 */
public class ConcreteAggregate extends Aggregate{
	private Object[] obj={"Monk Tang","Monkey","Pisf","haozi","luyi"};

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator();
	}
	public class ConcreteIterator implements Iterator{
		private int currentIndex = 0;
		public Object currentItem() {
			// TODO Auto-generated method stub
			return obj[currentIndex];
		}

		public void first() {
			// TODO Auto-generated method stub
			currentIndex = 0;
		}

		public boolean isDone() {
			// TODO Auto-generated method stub
			return (currentIndex==obj.length);
		}

		public void next() {
			// TODO Auto-generated method stub
			if(currentIndex<obj.length){
				currentIndex++;
			}
		}
		
	}
	
}
