package observable;

import observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    private int state;
    private List<Observer> observers = new ArrayList<>();
    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o:observers){
            // Technique Pop
            o.update(this);
            // Technique Push
            //o.update(state);
        }
    }

    public int getEtat() {
        return state;
    }

    public void setEtat(int state) {
        this.state = state;
        this.notifyObservers();
    }
}
