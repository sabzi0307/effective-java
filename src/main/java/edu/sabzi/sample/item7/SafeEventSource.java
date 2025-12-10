package edu.sabzi.sample.item7;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SafeEventSource {

    // Each listener is wrapped in a WeakReference
    private final List<WeakReference<Runnable>> listeners = new ArrayList<>();

    public void registerListener(Runnable listener) {
        listeners.add(new WeakReference<>(listener));
    }

    public void fireEvent() {

        Iterator<WeakReference<Runnable>> iterator = listeners.iterator();

        while (iterator.hasNext()) {
            WeakReference<Runnable> ref = iterator.next();
            Runnable listener = ref.get();

            if (listener == null) {
                // GC collected this listener → remove stale reference
                iterator.remove();
            } else {
                listener.run();
            }
        }
    }
}
