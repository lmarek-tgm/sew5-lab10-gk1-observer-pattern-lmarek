import java.util.ArrayList;

public abstract class Subject{

	private ArrayList<Observer> observers;
	public Subject() {
		observers = new ArrayList<>();
	}

	public void attach(Observer o) {
		observers.add(o);
	}

	public void detach(Observer o) {
		observers.remove(o);
	}

	public void notifyObserver() {
		for(Observer o: observers) {
			o.update();
		}
	}

}
