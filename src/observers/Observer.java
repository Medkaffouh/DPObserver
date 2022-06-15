package observers;

import observable.Observable;

public interface Observer {
    // Technique Pop
    void update(Observable observable);

    // Technique Push
    //void update(int state);
}
