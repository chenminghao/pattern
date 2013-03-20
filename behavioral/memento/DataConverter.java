/**
 * 
 */
package memento;

/**
 * @author chenminghao Dec 29, 2009 3:47:53 PM
 */
public class DataConverter implements java.io.Serializable{
	public static String DATA_FILE = "Data.txt";
	public static String[] data={"cmh","chengminghao","6666666","dddd","","ff"};
	public static String OUTPUT_FILE = "SQL.txt";
	private long ID = 0;
	public Memento createMemento() {
		return (new Memento(ID));
	}
	public void setMemento(Memento memento) {
		if (memento != null)ID = memento.getID();
	}
	public long getLastProcessedID(){
		return this.ID;
	}
	public void setLatProcessedID(long lastID){
		this.ID = lastID;
	}
	public boolean process() {
		boolean flag = true;;
		for(int i = 0;i<data.length;i++){
			if(i>=this.ID){
				if(data[i].length()<=0){
					flag = false;
					this.ID = new Long(i).longValue();
					break;
				}
			}
		}
		return flag;
	}
	public class Memento implements java.io.Serializable{
		private long lastProcessedID;
		private Memento(long ID) {
			lastProcessedID = ID;
		}
		private long getID() {
			return lastProcessedID;
		}
	}
}
