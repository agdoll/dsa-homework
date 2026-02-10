package Lab_Pokemon_Generics;

public class PokeBox {
    private Pokemon value;

    PokeBox(Pokemon value) {
        this.value = value;
    }

    public Pokemon get(){
        return this.value;
    }

    public void set(Pokemon newValue) {
        this.value = newValue;
    }
}
