package Pokemon;

public class LevelUp {

    public static int levelUpHP(int currentLevel,int numLevels, int currentHP, int IV){
        if (numLevels < 1){
            return currentHP;
        }
        int newHP = currentHP;
        for (int i = 0; i < numLevels; i++) {
            newHP = ((2*currentHP+IV)*currentLevel)/100+currentLevel+10;
        }
        return  newHP;
    }

    public static int levelUpStat(int currentLevel,int numLevels, int currentStat, int IV){
        if (numLevels < 1){
            return currentStat;
        }
        int newStat = currentStat;
        for (int i = 0; i < numLevels; i++) {
            newStat = ((2*currentStat+IV)*currentLevel)/100+5;
        }
        return  newStat;
    }

}
