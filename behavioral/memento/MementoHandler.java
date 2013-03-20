/**
 * 
 */
package memento;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author chenminghao
 * Dec 29, 2009
 * 4:12:49 PM
 */
public class MementoHandler {
	public static final String ID_FILE = "c://d//ID.txt";
	private DataConverter.Memento objMemento = null;
	public DataConverter.Memento getMemento() {
		ObjectInputStream objStream = null;
		java.io.File ff=null;
     try  {
    	 ff=new java.io.File(ID_FILE);  
    	 if(!ff.exists()) {
    		 DataConverter objConverter = new DataConverter();
    		 return objConverter.createMemento();
    	 }
    	 objStream = new ObjectInputStream(new FileInputStream(ff));
				objMemento = (DataConverter.Memento)objStream.readObject();
				objStream.close();
			}catch(Exception e){
				e.printStackTrace();
				try {
					objStream.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("Error Reading Memento");
				//System.exit(1);
			}
			finally{
				if(ff.exists())ff.delete();
			}
			return objMemento;
	}
	public void setMemento(DataConverter.Memento memento) {
		ObjectOutputStream  objStream = null;
		 try  {
			 java.io.File fff=null;
			 fff=new java.io.File(ID_FILE);  
			 if(!fff.exists()){
				 fff.createNewFile();
			 }
			 objStream = new ObjectOutputStream (new FileOutputStream(fff));
				objStream.writeObject(memento);
				objStream.close();
			}catch(Exception e){
				e.printStackTrace();
				System.out.println("Error Reading Memento");
				//System.exit(1);
			}
	}
}
