/**
 * 
 */
package datastructure.string;

/**
 * 对于一个字符串，请设计一个算法，只在字符串的单词间做逆序调整，
 * 也就是说，字符串由一些由空格分隔的部分组成，你需要将这些部分逆序。
 *
 * 给定一个原字符串A和他的长度，请返回逆序后的字符串。
 *"dog loves pig",13 返回 "pig loves dog"
 * @author cmh
 * 2017 下午10:06:01
 */
public class Reverse {
	
	public static String reverse(String A, int n) {
		if (n==0) {
			return "";
		}
		int changeNumber = n / 2;
		char[] arrayStr = A.toCharArray();
		for (int i = 0; i < changeNumber; i++) {
			char temp = arrayStr[i] ;
			arrayStr[i] = arrayStr[n-i-1];
			arrayStr[n-1-i] = temp;
		}
		return String.valueOf(arrayStr);
	}
	public static String reverseSentence(String A, int n) {
		String result = "";
		if (n==0) {
			return "";
		}
		
		String[] tempArray = A.split(" ");
		if(tempArray.length == 1 ){
			return reverse(A, n);
		} else {
			String tempC = reverse(A, n);
			String[] tempArrayC = tempC.split(" ");
			for (int i = 0; i < tempArrayC.length; i ++) {
				String temp = Reverse.reverse(tempArrayC[i], tempArrayC[i].length());
				result = result +  temp + " ";
			}
			return result.substring(0, result.length()-1);
		}
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = Reverse.reverseSentence("dog loves pig", 13);
		System.out.println(str.toString());
	}
}
