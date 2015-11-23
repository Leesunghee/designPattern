import java.util.Random;

/**
 * Created by 0915183 on 2015-11-03.
 */
public class RandomExample {

    int randomRange = 10;
    int[] randomTable = new int[randomRange];
    int loopCount = 1000000;

    public static void main(String[] args) {

        RandomExample randomExample = new RandomExample();
        randomExample.init();
        randomExample.generate();
        randomExample.print();
    }

    private void print() {
        for (int i = 0; i < randomTable.length; i++) {
            System.out.println("randomTable  [" + i + "] = " + randomTable[i]);
        }
    }

    private void generate() {
        for (int i = 0; i < loopCount; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(randomRange);
            randomTable[randomNumber]++;
        }
    }

    private void init() {
        for (int i = 0; i < randomTable.length; i++) {
            randomTable[i] = 0;
        }
    }
}
