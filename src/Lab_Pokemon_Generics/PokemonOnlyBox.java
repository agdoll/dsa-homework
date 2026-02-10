package Lab_Pokemon_Generics;

public class PokemonOnlyBox<T extends Pokemon> {
    private T value;

    PokemonOnlyBox(T value) {
        this.value = value;
    }

    public T get() {
        return this.value;
    }

    public void set(T NewValue) {
        this.value = NewValue;
    }

    public String getType() {
        return value.getType();
    }
}
