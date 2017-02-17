/**
 * 
 */
package weightrandom;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * 
 * @author cmh
 *
 */
public class RandomThread extends Thread {
	private int index;
	public static String getCurrentDateTime() {
		SimpleDateFormat   sDateFormat   =   new   SimpleDateFormat("yyyy-MM-dd   hh:mm:ss");     
		String   date   =   sDateFormat.format(new   java.util.Date()); 
		return date;
	}
	
	public RandomThread(int index) {
		this.index = index;
	}
	@Override
	public void run() {
		System.out.println(getCurrentDateTime() + " "+index+"begin:");
		Node node1 = new Node(1,1,10);
		Node node2 = new Node(2,1,5000);
		Node node3 = new Node(3,1,30000);
		//Node node4 = new Node(4,1,8000);
		List<Node> list  = new ArrayList<Node>();
		list.add(node1);
		list.add(node2);
		list.add(node3);
		//list.add(node4);
		//List<Node> weightList = new ArrayList<Node>();
		List<Node> weightList = new LinkedList<Node>();
		for (Node node : list) {
			int weight = node.getWeight();
			
			for (int i = 0; i<weight;i++) {
				weightList.add(node);
			}
		}
		
		
		
		Map<Integer, Node> map = new LinkedHashMap<Integer, Node>();
		while (true) {
			int randomNumber = new Random().nextInt(weightList.size());
			Node oneNode = weightList.get(randomNumber);
			
			List<Node> removeList = new ArrayList<Node>();
			removeList.add(oneNode);
			weightList.removeAll(removeList);
			
			
			if (map.containsKey(oneNode.getId())) {
				continue;
			}
			map.put(oneNode.getId(), oneNode);
			if (map.size() == list.size()) {
				break;
			}
		}
		List<Node> totalList = new ArrayList<Node>();
		StringBuffer sb = new StringBuffer();
		for (Integer id: map.keySet()) {
			totalList.add(map.get(id));
			sb.append(id.toString());
		}
		System.out.println(sb.toString());
		
		System.out.println(getCurrentDateTime()+ " "+index+" end:");
		
	}
	
}
