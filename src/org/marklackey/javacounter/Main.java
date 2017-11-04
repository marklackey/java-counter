package org.marklackey.javacounter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    private static List<String> output = new ArrayList<>();

    public static void main(String[] args) {
        SimpleCounter counter = new SimpleCounter();
        addToOutput("new SimpleCounter(): " + counter);
        addToOutput("counter.get(): " + counter.get());
        addToOutput("counter.increment(): " + counter.increment());
        addToOutput("counter.decrement(): " + counter.decrement());
        addToOutput("counter.increment(): " + counter.increment());
        addToOutput("counter.increment(): " + counter.increment());
        addToOutput("counter.decrementAndGet(): " + counter.decrementAndGet());
        addToOutput("counter: " + counter);
        addToOutput("counter.getAndDecrement(): " + counter.getAndDecrement());
        addToOutput("counter: " + counter);
        addToOutput("counter.incrementAndGet(): " + counter.incrementAndGet());
        addToOutput("counter: " + counter);
        addToOutput("counter.getAndIncrement(): " + counter.getAndIncrement());
        addToOutput("counter: " + counter);
        addToOutput("counter.set(5): " + counter.set(5));
        addToOutput("counter: " + counter);
        addToOutput("new SimpleCounter(5): " + new SimpleCounter(5));
        printRightAlignedOutput();

    }

    private static void printRightAlignedOutput() {
        output.stream().
            max(Comparator.comparingInt(String::length)).
            ifPresent(
                value ->
                    output.forEach(item -> {
                        String[] splitString = item.split(": ");
                        println(String.format("%1$-" + (value.length() - 2) + "s", splitString[0]) + "-> " + splitString[1]);
                    })
            );
    }

    private static void println(Object o) {
        System.out.println(o);
    }

    private static void addToOutput(String s) {
        output.add(s);
    }
}
