package Pokemon;

import java.util.Random;

public class Pokemon {
    // Standard Stats
    private int pokedexNumber;
    private String name;
    private String type1;
    private String type2;
    private int generation;
    private boolean legendary;

    // Individual Stats
    private String gender;
    private Integer trainerID;
    private boolean isShiny;
    // IVs
    private int IVhp;
    private int IVattack;
    private int IVdefense;
    private int IVspAttack;
    private int IVspDefense;
    private int IVspeed;

    //private String nature;

    // Battle Stats
    private int level;
    private int expPoints;
    private int total;
    private int hp;
    private int attack;
    private int defense;
    private int spAttack;
    private int spDefense;
    private int speed;

    public Pokemon(PokemonBase pokemonBase, int level){
        // Standard Stats
        this.pokedexNumber = pokemonBase.getPokedexNumber();
        this.name = pokemonBase.getName();
        this.type1 = pokemonBase.getType1();
        this.type2 = pokemonBase.getType2();
        this.generation = pokemonBase.getGeneration();
        this.legendary = pokemonBase.isLegendary();
        // Individual Stats
        this.gender = generateGender(pokemonBase.getPercentMale());
        this.trainerID = null;
        this.isShiny = generateShiny();
        // IVs
        this.IVhp = generateIV();
        this.IVattack = generateIV();
        this.IVdefense = generateIV();
        this.IVspAttack = generateIV();
        this.IVspDefense = generateIV();
        this.IVspeed = generateIV();
        // Battle Stats
        this.level = level;
        this.expPoints = getExpPoints(level);
        this.hp = LevelUp.levelUpHP(5,level-5,pokemonBase.getHp(),IVspeed);
        this.attack = LevelUp.levelUpStat(5,level-5,pokemonBase.getAttack(),IVattack);
        this.defense = LevelUp.levelUpStat(5,level-5,pokemonBase.getDefense(),IVdefense);
        this.spAttack = LevelUp.levelUpStat(5,level-5,pokemonBase.getSpAttack(),IVspAttack);
        this.spDefense = LevelUp.levelUpStat(5,level-5,pokemonBase.getSpDefense(),IVspDefense);
        this.speed = LevelUp.levelUpStat(5,level-5,pokemonBase.getSpeed(),IVspeed);
        this.total = this.level+this.expPoints+this.hp+this.attack+this.defense+this.spAttack+this.spDefense+this.speed;
    }

    // Helper Methods
    private String generateGender(double percentageMale){
        // Return null if genderless
        if (percentageMale == -1){
            return null;
        }
        int random = new Random().nextInt(10000);
        if (random < (int) percentageMale*100){
            return "male";
        }
        return "female";
    }
    private boolean generateShiny(){
        int random = new Random().nextInt(8192);
        if (random == 69){
            return true;
        }
        return false;
    }
    private int generateIV(){
        int random = new Random().nextInt(32);
        return random;
    }
    private int getExpPoints(int level){
        return (int) Math.pow(level,3);
    }

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

    public int getGeneration() {
        return generation;
    }

    public boolean isLegendary() {
        return legendary;
    }

    public String getGender() {
        return gender;
    }

    public Integer getTrainerID() {
        return trainerID;
    }

    public boolean isShiny() {
        return isShiny;
    }

    public int getIVhp() {
        return IVhp;
    }

    public int getIVattack() {
        return IVattack;
    }

    public int getIVdefense() {
        return IVdefense;
    }

    public int getIVspAttack() {
        return IVspAttack;
    }

    public int getIVspDefense() {
        return IVspDefense;
    }

    public int getIVspeed() {
        return IVspeed;
    }

    public int getLevel() {
        return level;
    }

    public int getExpPoints() {
        return expPoints;
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

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", type1='" + type1 + '\'' +
                ", type2='" + type2 + '\'' +
                ", gender='" + gender + '\'' +
                ", level=" + level +
                ", hp=" + hp +
                ", attack=" + attack +
                ", defense=" + defense +
                ", spAttack=" + spAttack +
                ", spDefense=" + spDefense +
                ", speed=" + speed +
                ", shiny=" + isShiny +
                '}';
    }
}
