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
		 * java ���Ա���Υ���˿���ԭ���������תԭ�򣬵��ǹ�������ģʽ��Υ���Ĺ����ŵ�����Ĺ���
		 * �������Υ������ĵط��ŵ����ڿ��Ƶĵط�
		 */
		return new Banana();
	}
}
