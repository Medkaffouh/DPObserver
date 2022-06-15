import observable.Observable;
import observable.ObservableImpl;
import observers.Observer;
import observers.ObserverImpl1;
import observers.ObserverImpl2;

public class TestObserver {
    public static void main(String[] args){
        ObservableImpl observable=new ObservableImpl();
        Observer observer1=new ObserverImpl1();
        Observer observer2=new ObserverImpl2();
        observable.subscribe(observer1);
        observable.subscribe(observer2);

        observable.setEtat(90);
        System.out.println("-----------------------");
        observable.setEtat(60);

        System.out.println("********************");
        observable.unsubscribe(observer2);
        observable.setEtat(87);
    }
}
