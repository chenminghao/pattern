/**
 * 
 */
package memento;

/**
 * @author chenminghao
 * Dec 29, 2009
 * 4:08:35 PM
 */
public class DataClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MementoHandler objMementoHandler = new MementoHandler();
		DataConverter objConverter = new DataConverter();
		objConverter.setMemento(objMementoHandler.getMemento());
		if (!(objConverter.process())) {
			System.out.println("errer:");
			objMementoHandler.setMemento(objConverter.createMemento());
		}
	}

}
