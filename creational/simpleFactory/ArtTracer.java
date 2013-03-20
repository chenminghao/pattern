/**
 * 
 */
package simpleFactory;

/**
 * @author tianyi
 *
 */
public class ArtTracer {
		public static Shape factory(String whichOne) throws BadShapeException{
			if(whichOne.equalsIgnoreCase("circle")){
				return new Circle();
			}else if(whichOne.equalsIgnoreCase("square")){
				return new Square();
			}else{
				throw new BadShapeException(whichOne);
			}
		}
}
