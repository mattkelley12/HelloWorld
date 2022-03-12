package Pokemon;

public class Move {
    private String name;
    private String type;
    private String category;
    private Integer power;
    private Integer accuracy;
    private Integer PP;
    private String effect;
    private Integer probability;
    private String TM;
    private int gen;

    public Move(String name, String type, String category, Integer power, Integer accuracy, Integer PP,
                String effect, Integer probability, String TM, int gen){
        this.name = name;
        this.type = type;
        this.category = category;
        this.power = power;
        this.accuracy = accuracy;
        this.PP = PP;
        this. effect = effect;
        this.probability = probability;
        this.TM = TM;
        this.gen = gen;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getCategory() {
        return category;
    }

    public Integer getPower() {
        return power;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public Integer getPP() {
        return PP;
    }

    public String getEffect() {
        return effect;
    }

    public Integer getProbability() {
        return probability;
    }

    public String getTM() {
        return TM;
    }

    public int getGen() {
        return gen;
    }
}
