package game_project;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Score> {// comparator tu java va lay thong tin tu class Score
        public int compare(Score score1, Score score2) {

            int sc1 = score1.getScore();
            int sc2 = score2.getScore();// descending
            if (sc1 > sc2){
                return -1;
            }else if (sc1 < sc2){
                return +1;
            }else{
                return 0;
            }
        }
}