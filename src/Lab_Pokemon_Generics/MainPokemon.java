package Lab_Pokemon_Generics;

public class MainPokemon {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", "Electric");
        Pokemon charmander = new Pokemon("Charmander", "Fire");

        System.out.println("Pokemons: ");
        System.out.println(pikachu);
        System.out.println(charmander);
        System.out.println();

        // step 1
        System.out.println("Step 1:");
        PokeBox box = new PokeBox(pikachu);
        System.out.println(box.get());
        box.set(charmander);
        System.out.println(box.get());
        System.out.println();

        // step 2
        System.out.println("Step 2:");
        Box<Pokemon> pokemonBox = new Box<>(pikachu);
        Box<String> itemBox = new Box<>("Oran Berry");
        Box<Integer> levelBox = new Box<>(25);
        System.out.println(pokemonBox.get());
        System.out.println(itemBox.get());
        System.out.println(levelBox.get());
        System.out.println();

        // step 3
        System.out.println("Step 3:");
        Pair<Pokemon, String> heldItem = new Pair<>(pikachu, "Oran Berry");
        System.out.println(heldItem);
        System.out.println();

        // step 4
        System.out.println("Step 4: ");
        PokemonOnlyBox<Pokemon> b1 = new PokemonOnlyBox<>(pikachu);
        System.out.println(b1.getType());
        System.out.println();

        // step 5
        System.out.println("Step 5: ");
        BattlePokemon squirtle = new BattlePokemon("Squirtle", "Water", 60);
        PokemonOnlyBox<BattlePokemon> battleBox = new PokemonOnlyBox<>(squirtle);
        System.out.println(battleBox.get());
        System.out.println();

        // step 6
        System.out.println("Step 6: ");
        Box<String> a = new Box<>("Potion");
        Box<String> b = new Box<>("Rare Candy");
        System.out.println("Before: a=" + a.get() + ", b=" + b.get());
        swap(a, b);
        System.out.println("After:  a=" + a.get() + ", b=" + b.get());
        System.out.println();

        // step 7

    }

    public static <T> void swap(Box<T> a, Box<T> b) {
        T temp = a.get();
        a.set(b.get());
        b.set(temp);
    }
}

