/**
 * 
 */
package datastructure.stack;

import java.util.Stack;

/**
 * 编写一个类,只能用两个栈结构实现队列,支持队列的基本操作(push，pop)。
 * 给定一个操作序列ope及它的长度n，其中元素为正数代表push操作，为0代表pop操作，
 * 保证操作序列合法且一定含pop操作，请返回pop的结果序列。
 * [1,2,3,0,4,0],6
 * 返回：[1,2]
 * 
 * @author cmh
 * 2017 上午12:36:05
 */
public class TwoStack {
	 private Stack<Integer> pushStack = new Stack<Integer>();
	 private Stack<Integer> popStack = new Stack<Integer>();
	 public void push(int node) {
		 pushStack.push(node);
	 }
	
	 public int pop() {
		 if (popStack.isEmpty()) {
			 //一次性全部导入popStack中 popStack中有数据不倒入
			 while (pushStack.size() != 0) {
				 popStack.push(pushStack.pop());
			 }
		 }
		 return popStack.pop();
	 }
	 
	public  int[] twoStack(int[] ope, int n) {
		int[] ret = new int[n];
		int count = 0;
        for (int i = 0; i < n ; i++) {
        	if (ope[i] > 0) {
        		push(ope[i]);
        		ret[i] = -1;
        	} else if(ope[i] == 0){
        		ret[i] = pop();
        		count++;
        	}
        }
        int[] result = new int[count];
        int index = 0;
        for (int i =0; i < n; i++) {
        	if (ret[i] > 0) {
        		result[index] = ret[i];
        		index++;
        	}
        }
       return result;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TwoStack ts = new TwoStack();
		int[] cmh = new int[]{1,2,3,0,4,0};
		int[] ret = ts.twoStack(cmh,6);
		for (int temp: ret) {
			System.out.println(temp);
		}
	}

}
