/**
 * 
 */
package simpleFactory;

/**
 * @author tianyi
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			//@SuppressWarnings("unused")
			ArtTracer art = new ArtTracer();
			Shape circle = ArtTracer.factory("ci");
			circle.draw();
			
			
		}catch(BadShapeException e	){
			e.printStackTrace();
		}
		
	}

}
