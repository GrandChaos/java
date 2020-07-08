package ru.sbrf.jc.demo;

public class GenericClass<T> {
    private T value;

    private void setValue(T value) {
        this.value = value;
    }

    private T getValue() {
        return value;
    }
}
