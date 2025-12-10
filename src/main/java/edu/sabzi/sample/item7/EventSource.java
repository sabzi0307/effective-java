package edu.sabzi.sample.item7;

import java.util.ArrayList;
import java.util.List;

public class EventSource {

    private final List<Runnable> listeners = new ArrayList<>();

    public void registerListener(Runnable listener) {
        listeners.add(listener); // ❌ memory leak if never removed
    }
}
