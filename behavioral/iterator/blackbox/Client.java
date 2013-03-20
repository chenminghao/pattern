/**
 * 
 */
package iterator.blackbox;

/**
 * @author tianyi
 * 2007-10-26
 * ионГ12:45:13
 */
public class Client {
	private Iterator it;
	private Aggregate agg = new ConcreteAggregate();
	public void operatrion(){
		it = agg.createIterator();
		while(!it.isDone()){
			System.out.println(it.currentItem().toString());
			it.next();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client();
		client.operatrion();
	}

}
