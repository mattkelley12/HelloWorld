package Pokemon;

public class PokemonBase2 {

    private String[] abilities;
    private double againstBug;
    private double againstDark;
    private double againstDragon;
    private double againstElectric;
    private double againstFairy;
    private double againstFight;
    private double againstFire;
    private double againstFlying;
    private double againstGhost;
    private double againstGrass;
    private double againstGround;
    private double againstIce;
    private double againstNormal;
    private double againstPoison;
    private double againstPsychic;
    private double againstRock;
    private double againstSteel;
    private double againstWater;
    private int attack;
    private int baseEggSteps;
    private int baseHappiness;
    private int baseTotal;
    private int captureRate;
    private String classification;
    private int defense;
    private long experienceGrowth;
    private double height;
    private int hp;
    private String name;
    private double percentMale;
    private int pokedexNumber;
    private int spAttack;
    private int spDefense;
    private int speed;
    private String type1;
    private String type2;
    private double weight;
    private int generation;
    private boolean legendary;

    public PokemonBase2(String[] abilities, double againstBug, double againstDark, double againstDragon,
                        double againstElectric, double againstFairy, double againstFight, double againstFire,
                        double againstFlying, double againstGhost, double againstGrass, double againstGround,
                        double againstIce, double againstNormal, double againstPoison, double againstPsychic,
                        double againstRock, double againstSteel, double againstWater, int attack, int baseEggSteps,
                        int baseHappiness, int baseTotal, int captureRate, String classification, int defense,
                        long experienceGrowth, double height, int hp, String name, double percentMale,
                        int pokedexNumber, int spAttack, int spDefense, int speed, String type1, String type2,
                        double weight, int generation, boolean legendary) {
        this.abilities = abilities;
        this.againstBug = againstBug;
        this.againstDark = againstDark;
        this.againstDragon = againstDragon;
        this.againstElectric = againstElectric;
        this.againstFairy = againstFairy;
        this.againstFight = againstFight;
        this.againstFire = againstFire;
        this.againstFlying = againstFlying;
        this.againstGhost = againstGhost;
        this.againstGrass = againstGrass;
        this.againstGround = againstGround;
        this.againstIce = againstIce;
        this.againstNormal = againstNormal;
        this.againstPoison = againstPoison;
        this.againstPsychic = againstPsychic;
        this.againstRock = againstRock;
        this.againstSteel = againstSteel;
        this.againstWater = againstWater;
        this.attack = attack;
        this.baseEggSteps = baseEggSteps;
        this.baseHappiness = baseHappiness;
        this.baseTotal = baseTotal;
        this.captureRate = captureRate;
        this.classification = classification;
        this.defense = defense;
        this.experienceGrowth = experienceGrowth;
        this.height = height;
        this.hp = hp;
        this.name = name;
        this.percentMale = percentMale;
        this.pokedexNumber = pokedexNumber;
        this.spAttack = spAttack;
        this.spDefense = spDefense;
        this.speed = speed;
        this.type1 = type1;
        this.type2 = type2;
        this.weight = weight;
        this.generation = generation;
        this.legendary = legendary;
    }
}
}