package helpz;

public class LevelBuild {

     public static int[][] getLevelData(){

         // Create 2D int array
         // where every value is a tile on the level.
         int[][] lvl = {
                 {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
                 {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
                 {0, 0, 0 ,1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0},
                 {0, 0, 0 ,0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                 {0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                 {0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                 {0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                 {0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                 {0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                 {0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
         };
         return lvl;
     }

}