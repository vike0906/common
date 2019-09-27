package dp.observer;

public class ObserverPatternDemo {
	
	public static void main(String [] args) {
		Subject subject = new Subject();
		
		new BinaryObserver(subject);
		new OctalObserver(subject);
		new HexaObserver(subject);
		
		System.out.println("293");
		subject.setState(15);
		
		System.out.println("11");
		subject.setState(20);
	}
}
