/**
 * 
 */
package builder;

/**
 * @author Administrator
 *
 */
public class Builder {
	private Product product = new Product();
	
	private void partOne() {
		product.setAge(0);
	}
	
	private void partTwo() {
		product.setName("XXX");
	}
	
	public Product makePerson() {
		
		partOne();
		partTwo();
		return product;
	}
}
