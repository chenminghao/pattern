/**
 * 
 */
package datastructure.stack;

import java.util.Stack;
/**
 * 
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 * @author cmh
 *
 */
public class Solution {
	 private Stack<Integer> valueStack = new Stack();
	    private Stack<Integer>  minStack = new Stack();
	    public void push(int node) {
	        valueStack.push(node);
	        if (minStack.size() == 0 ) {
	        	minStack.push(node);
	        } else {
	            if (node <= minStack.peek()){
	            	minStack.push(node);
	            } else {
	            	minStack.push(minStack.peek());
	            }
	        }
	    }
	    
	    public void pop() {
	    	valueStack.pop();
	    	minStack.pop();
	    }
	    
	    public int top() {
	    	minStack.peek();
	    	return valueStack.peek();
	    	
	    }
	    
	    public int min() {
	    	return minStack.peek();
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
