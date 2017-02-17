package observernew;

public class ObserverImpl implements Observer {
	private String name ;
	
	public  ObserverImpl(String name) {
		this.name = name;
	}
	
	@Override
	public void update(Subject subject) {
		
		int money = subject.getAddMoney();
		System.out.println(name+": subject add money "+money);
	}

}
