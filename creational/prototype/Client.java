/**
 * 
 */
package prototype;

/**
 * @author tianyi
 * 2007-11-6
 * ÉÏÎç12:18:00
 */
public class Client {
	//private static PanadaToClone thisPanada,clonePanada;
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		
		PanadaToClone thisPanada,clonePanada;
		// TODO Auto-generated method stub
		thisPanada=new PanadaToClone(12,23,45);
		thisPanada.setName(new String("haozi"));
		clonePanada=(PanadaToClone)thisPanada.clone();
		clonePanada.setName("chang4434e");
		System.out.print("thisPanadaAge="+thisPanada.getAge());
		System.out.print(" thisPanadaHeight="+thisPanada.getHeight());
		System.out.print(" thisPanadaWeight="+thisPanada.getWeight());
		System.out.println(" thisPanadaWeight="+thisPanada.getName());
		
		System.out.print("clonePandaAge="+clonePanada.getAge());
		System.out.print(" clonePandaHeight="+clonePanada.getHeight());
		System.out.print(" clonePandaWeight="+clonePanada.getWeight());
		System.out.println(" clonePandaWeight="+clonePanada.getName());
	}

}
