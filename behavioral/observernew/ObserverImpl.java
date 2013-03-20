package observernew;

public class ObserverImpl implements Observer {

	@Override
	public void update(Subject subject) {
		// TODO Auto-generated method stub
		//(SubjectImpl)
		int money = subject.getAddMoney();
		System.out.println(" phone message:you add money "+money);
	}

}
