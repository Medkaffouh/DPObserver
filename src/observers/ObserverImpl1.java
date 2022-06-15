package observers;

public class ObserverImpl1 implements Observer {
    private double somme;
    @Override
    public void update(int state) {
        somme+=state;
        System.out.println("Observateur 1 Somme="+somme);
    }
}
