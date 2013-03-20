/**
 * 
 */
package factorymethod;

/**
 * @author tianyi
 *
 */
public class BananaFactory implements FruitFactory{
	/**
	 * factory method for creating applefruit
	 */
	public Fruit factory(){
		/**
		 * java 语言本身违反了开闭原则和依赖倒转原则，但是工厂方法模式把违反的工作放到具体的工作
		 * 工厂里，把违反法则的地方放到易于控制的地方
		 */
		return new Banana();
	}
}
