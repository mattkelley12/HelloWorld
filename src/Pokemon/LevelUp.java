package Pokemon;

public class LevelUp {

    public static int levelUpHP(int level,int numLevels, int baseHP, int IV){
        if (numLevels < 1){
            return baseHP;
        }
        int newHP = baseHP;
        int currentLevel = level;
        for (int i = 0; i < numLevels; i++) {
            currentLevel++;
            newHP = ((2*baseHP+IV)*currentLevel)/100+currentLevel+10;
        }
        return  newHP;
    }

    public static int levelUpStat(int level,int numLevels, int baseStat, int IV){
        if (numLevels < 1){
            return baseStat;
        }
        int newStat = baseStat;
        int currentLevel = level;
        for (int i = 0; i < numLevels; i++) {
            currentLevel++;
            newStat = ((2*baseStat+IV)*currentLevel)/100+5;
            System.out.println("");
        }
        return  newStat;
    }

}
