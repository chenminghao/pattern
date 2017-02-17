/**
 * 
 */
package sort;

/**
 * @author cmh
 *
 */
public class Sort {
	/**
	 * 
	 * 真实时间复杂度n*(n-1)/2（最坏情况，比如刚刚好逆序） n趋向无穷大是为o(n的平方)
	 * @param intArrays
	 * @return
	 */
	public static int[] BubbleSort(int[] intArrays) {
		
		for (int i = 0;i < intArrays.length-1 ;i++) {
			
			for (int j = i+1 ;j <intArrays.length ;j++) {
				
				if (intArrays[i] > intArrays[j]) {
					int temp = intArrays[i];
					intArrays[i] = intArrays[j];
					intArrays[j] = temp;
				}
			}
			
		}
		
		return intArrays;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] intArrays = {3,2,1};
		int[] restult = Sort.BubbleSort(intArrays);
		for (int i = 0; i < restult.length; i++) {
			System.out.println(restult[i]);
		}
	}

}
