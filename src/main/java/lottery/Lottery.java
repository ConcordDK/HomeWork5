package lottery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        ArrayList<Integer> randomNumberLottery = new ArrayList<>();
        Random ballsWithNumbers = new Random();
        for (int i = 0; i < 100; i++) {
            randomNumberLottery.add(ballsWithNumbers.nextInt(100));
        }
        Collections.shuffle(randomNumberLottery);
        for (int i = 0; i < 10; i++) {
            System.out.println("Выпавшие шарики с числами: " + randomNumberLottery.get(i));
        }
    }
}