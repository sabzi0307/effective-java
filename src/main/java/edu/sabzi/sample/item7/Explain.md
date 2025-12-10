## Item 7: Eliminate Obsolete Object References

When an object is no longer needed, remove its reference — otherwise it becomes a memory leak.

Even in a garbage-collected language like Java, you can leak memory if you hold on to objects longer than needed.

#### Common causes:

1- Manually managed memory (like a custom stack)

2- Caches that never evict entries

3- Listeners / callbacks not removed

4- Wrong scope variables (e.g., static fields)


⚠️ Bad Example – Custom Stack With Memory Leak

A simple stack implementation that doesn't null-out popped elements.

##### LeakyStack 

Why is this a leak?

Even after popping, the array still holds references.
GC cannot reclaim objects referenced inside the array.

#### EventSource
Other Memory Leak Example – Listeners Not Removed

Fix: use WeakReference or provide unregister method.



- Java GC cannot clean objects that are still referenced

- Custom memory structures often leak if not carefully managed

- Clear references (element = null) when you know they’re no longer needed

- Avoid unbounded caches and stale listeners

- Use weak references for callback registration

