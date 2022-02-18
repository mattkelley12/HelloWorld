public class Pokemon {

    public String pokedexNumber;
    public String name;
    public String height;
    public double weight;
    private PokemonType type;


    public Pokemon(String pokedexNumber, String name, String height, double weight, PokemonType type) {
        this.pokedexNumber = pokedexNumber;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.type = type;


    }

    public PokemonType getType() {
        return type;

    }

    public String getName() {
        return name;

    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "pokedexNumber='" + pokedexNumber + '\'' +
                ", name='" + name + '\'' +
                ", height='" + height + '\'' +
                ", weight=" + weight +
                ", type=" + type +
                '}';
    }
}
