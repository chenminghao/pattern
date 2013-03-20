/**
 * 
 */
package prototype;

/**
 * @author tianyi
 * 2007-11-8
 * обнГ09:14:25
 */
public class TheGreatestSage {
	private Monkey monkey = new Monkey();
	public void change(){
		Monkey copyMonkey;
		for(int i=0;i<100;i++){
			
		}
		copyMonkey=(Monkey)monkey.clone();
		System.out.print(" monkeygetHeight="+monkey.getHeight());
		System.out.print(" monkeygetWeight="+monkey.getWeight());
		System.out.println(" monkeygetBirthDate="+monkey.getBirthDate());
		
		
		System.out.print(" copyMonkeyHeight="+copyMonkey.getHeight());
		System.out.print(" copyMonkeyWeight="+copyMonkey.getWeight());
		System.out.println(" copymonkeyBirthDate="+copyMonkey.getBirthDate());
		System.out.println(" staff is the same? "+(monkey.getStaff()==copyMonkey.getStaff()));
		System.out.println("monkey==copy Monkey "+(monkey==copyMonkey));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheGreatestSage sage = new TheGreatestSage();
		sage.change();
	}

}
