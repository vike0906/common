package dp.observer;

public class BinaryObserver extends Observer{

	public BinaryObserver(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println( "Binary String: " 
			      + Integer.toBinaryString( subject.getState() ) ); 
	}

}
