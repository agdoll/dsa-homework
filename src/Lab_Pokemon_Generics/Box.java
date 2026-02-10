package Lab_Pokemon_Generics;

public class Box<T>{
    private T value;

    Box(T value) {
        this.value = value;
    }

    public T get() {
        return this.value;
    }

    public void set(T newValue) {
        this.value = newValue;
    }


}
