package org.marklackey.javacounter;

public class SimpleCounter extends Number {
    private int value;

    public SimpleCounter() {
    }

    public SimpleCounter(int initialValue) {
        this.value = initialValue;
    }

    public SimpleCounter decrement() {
        this.value--;
        return this;
    }

    public int decrementAndGet() {
        return --this.value;
    }

    public int get() {
        return this.value;
    }

    public int getAndDecrement() {
        return this.value--;
    }

    public int getAndIncrement() {
        return this.value++;
    }

    public SimpleCounter increment() {
        this.value++;
        return this;
    }

    public int incrementAndGet() {
        return ++this.value;
    }

    public SimpleCounter set(int newValue) {
        this.value = newValue;
        return this;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }

    @Override
    public double doubleValue() {
        return (double) value;
    }

    @Override
    public float floatValue() {
        return (float) value;
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return (long) value;
    }

    @Override
    public short shortValue() {
        return (short) value;
    }
}
