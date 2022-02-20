package Pokemon;

import java.util.Random;

public class Pokemon2 {
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

    public Pokemon2(PokemonBase pokemonBase, int level){
        // Standard Stats
        this.pokedexNumber = pokemonBase.getPokedexNumber();
        this.name = pokemonBase.getName();
        this.type1 = pokemonBase.getType1();
        this.type2 = pokemonBase.getType2();
        this.generation = pokemonBase.getGeneration();
        this.legendary = pokemonBase.isLegendary();
        // Individual Stats
        this.gender = generateGender();
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
    private String generateGender(){
        int random = new Random().nextInt(2);
        if (random == 1){
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
                '}';
    }
}
