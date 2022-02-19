package Pokemon;

public class PokemonBase {

    private int pokedexNumber;
    private String name;
    private String type1;
    private String type2;
    private int total;
    private int hp;
    private int attack;
    private int defense;
    private int spAttack;
    private int spDefense;
    private int speed;
    private int generation;
    private boolean legendary;




    public PokemonBase(int pokedexNumber, String name, String type1, String type2, int total, int hp, int attack, int defense, int spAttack,
                       int spDefense, int speed, int generation, boolean legendary) {
        this.pokedexNumber = pokedexNumber;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.total = total;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.spAttack = spAttack;
        this.spDefense = spDefense;
        this.speed = speed;
        this.generation = generation;
        this.legendary = legendary;



    }

    // Getters


    public int getPokedexNumber() {
        return pokedexNumber;
    }

    public String getName() {
        return name;
    }

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    public int getTotal() {
        return total;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpAttack() {
        return spAttack;
    }

    public int getSpDefense() {
        return spDefense;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGeneration() {
        return generation;
    }

    public boolean isLegendary() {
        return legendary;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "pokedexNumber=" + pokedexNumber +
                ", name='" + name + '\'' +
                ", type1='" + type1 + '\'' +
                ", type2='" + type2 + '\'' +
                ", total=" + total +
                ", hp=" + hp +
                ", attack=" + attack +
                ", defense=" + defense +
                ", spAttack=" + spAttack +
                ", spDefense=" + spDefense +
                ", speed=" + speed +
                ", generation=" + generation +
                ", legendary=" + legendary +
                '}';
    }
}