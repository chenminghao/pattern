/**
 * 
 */
package sort;
/**
 * @author cmh
 *
 */
public class Sort {
	
	public static void swapOne (int a, int b) {
		a = a + b ;
		b = a - b ;
		a = a - b ;
		System.out.println("a="+a);
		System.out.println("b=" +b);
	}
	public static void swapTwo(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("a="+a);
		System.out.println("b=" +b);
	}
	/**
	 * 
	 * 真实时间复杂度n*(n-1)/2（最坏情况，比如刚刚好逆序） n趋向无穷大是为o(n的平方)
	 * @param intArrays
	 * @return
	 */
	public static void SelectSort() {
		
		int[] intArrays = {3,2,1};
		for (int i = 0; i < intArrays.length-1 ; i++) {
			for (int j = i+1 ; j <intArrays.length ; j++) {
				if (intArrays[i] > intArrays[j]) {
					int temp = intArrays[i];
					intArrays[i] = intArrays[j];
					intArrays[j] = temp;
				}
			}
			
		}
		
		for (int i = 0; i < intArrays.length; i++) {
			System.out.println(intArrays[i]);
		}
		
	}
	
	public static void BubbleSort() {
		int[] intArrays = {3,2,1};
		for (int i = 0; i < intArrays.length-1; i++) {
			for (int j = 0; j < intArrays.length-i-1; j++) {
				if (intArrays[j] > intArrays[j+1]) {
					//一哈哦
					swapOne(intArrays[j],intArrays[j+1]);
					//intArrays[j]= intArrays[j] ^ intArrays[j+1];
					// intArrays[j+1] = intArrays[j] ^ intArrays[j+1];
					// intArrays[j] = intArrays[j] ^ intArrays[j+1];
					//int temp = intArrays[j];
					//intArrays[j] = intArrays[j+1];
					//intArrays[j+1] = temp;
				}
			}
		}
		
		for (int i = 0; i < intArrays.length; i++) {
			System.out.println(intArrays[i]);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Sort.BubbleSort();
		swapTwo(1,2);
	}
}
