/**
 * 
 */
package datastructure.string;

/**
 * 如果一个字符串str，把字符串str前面任意的部分挪到后面形成的字符串叫做str的旋转词。
 * 判断两个字符串是否互为旋转词。
 * @author cmh
 * 2017 下午9:48:52
 */
public class Rotation {
	public static boolean isRotation(String A, int lena, String B, int lenb) {
		if (A == null || B == null || lena != lenb ) {
			return false;
		}
		String c = A + A;
		return c.contains(B);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean flag = Rotation.isRotation("1234", 4,  "3412" , 4);
		System.out.println(Rotation.isRotation("1234", 4,  "3412", 4));
		System.out.println(Rotation.isRotation("1234", 4,  "34125", 5));

	}

}
