package observers;

import observable.Observable;
import observable.ObservableImpl;

public class ObserverImpl1 implements Observer {
    private double somme;
    @Override
    public void update(Observable observable) {
        int state =((ObservableImpl) observable).getEtat();
        somme+=state;
        System.out.println("Observateur 1 Somme="+somme);
    }
}
