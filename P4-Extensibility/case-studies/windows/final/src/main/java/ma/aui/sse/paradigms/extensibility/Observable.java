package ma.aui.sse.paradigms.extensibility;

import java.util.Iterator;
import java.util.LinkedList;

public class Observable<T> {
    
    private LinkedList<Observer<T>> observers = new LinkedList<>();

    public void subscribe(Observer<T> observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer<T> observer) {
        observers.remove(observer);
    }

    protected final void notify(T notification) {
        Iterator<Observer<T>> it = observers.iterator();
        while (it.hasNext()) {
            it.next().update(notification);
        }
    }
}
