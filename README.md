# java-counter
Simple Counter class in Java utilizing method cascading

# Description  
This simple class is designed to fulfill the need to have a
map filled with counters as values.
I modeled the interface after [AtomicInteger](https://goo.gl/JMdEsZ),
so as to be familiar to users of that class.
I wanted a class with method cascading so that returning the value
itself or a String representation would be easy.

# Usage  

```
new SimpleCounter()       -> 0  
counter.get()             -> 0  
counter.increment()       -> 1  
counter.decrement()       -> 0  
counter.increment()       -> 1  
counter.increment()       -> 2  
counter.decrementAndGet() -> 1  
counter                   -> 1  
counter.getAndDecrement() -> 1  
counter                   -> 0  
counter.incrementAndGet() -> 1 
counter                   -> 1  
counter.getAndIncrement() -> 1  
counter                   -> 2  
counter.set(5)            -> 5  
counter                   -> 5  
new SimpleCounter(5)      -> 5
```


