package observers;

public class ObserverImpl2 implements Observer {
    double lastState;
    @Override
    public void update(int state) {
        if(state-lastState>0)
            System.out.println("Observateur 2 => Augmentation de la pression");
        else if(state-lastState<0)
            System.out.println("Observateur 2 => Depression...");
        else System.out.println("Observateur 2 => Stabilité");
        lastState=state;
    }
}
