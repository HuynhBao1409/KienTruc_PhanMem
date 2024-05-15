package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Tigia {
    List<TigiaObserver> observers = new ArrayList<>();

    public void attach(TigiaObserver observer) {
        observers.add(observer);
    }

    public void detach(TigiaObserver observer) {
        observers.remove(observer);
    }

    protected void notify(double delta) {
        for (TigiaObserver observer : observers) {
            observer.tigiaChanged(delta);
        }
    }

    public static interface TigiaObserver {
        void tigiaChanged(double delta);
    }
}