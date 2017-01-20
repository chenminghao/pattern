/**
 * 
 */
package weightrandom;

/**
 * 
 * @author cmh
 *
 */
public class Node {
	private int id;
	//优先级
	private int priority;
	//权重
	private int weight;
	
	
	public Node(int id, int priority, int weight) {
		super();
		this.id = id;
		this.priority = priority;
		this.weight = weight;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
