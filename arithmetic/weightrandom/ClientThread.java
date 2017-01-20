/**
 * 
 */
package weightrandom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author cmh
 *
 */
public class ClientThread extends Thread {
   
	@Override
	public void run() {
		
		Node node1 = new Node(1,1,10);
		Node node2 = new Node(2,1,20000);
		Node node3 = new Node(3,1,30000);
		Node node4 = new Node(4,1,80000);
		List<Node> list  = new ArrayList<Node>();
		list.add(node1);
		list.add(node2);
		list.add(node3);
		list.add(node4);
		List<Node> weightList = new ArrayList<Node>();
		for (Node node : list) {
			int weight = node.getWeight();
			
			for (int i = 0; i<weight;i++) {
				weightList.add(node);
			}
		}
		
		int randomNumber = new Random().nextInt(weightList.size());
		Node oneNode = weightList.get(randomNumber);
		System.out.println(oneNode.getId());
		
	}
	
}
