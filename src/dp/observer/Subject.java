package dp.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private List<Observer> list = new ArrayList<Observer>();
	
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllOS();
	}
	
	public void attach(Observer os) {
		list.add(os);
	}
	
	public void notifyAllOS() {
		for(Observer os:list) {
			os.update();
		}
	}
}
