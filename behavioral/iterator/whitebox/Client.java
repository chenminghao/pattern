/**
 * 
 */
package iterator.whitebox;

/**
 * @author tianyi
 * 2007-10-25
 * обнГ10:46:28
 */
public class Client {
		private Iterator it;
		private Aggregate agg= new ConcreteAggregate();
		public void operation(){
			it=agg.getIterator();
			while(!it.isDone()){
				System.out.println(it.currentItem().toString());
				it.next();
			}
		}
		public static void main(String[] args){
			Client client = new Client();
			client.operation();
		}
}
