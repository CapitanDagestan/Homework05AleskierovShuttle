import java.util.Random;

public class Shuttles {
    public static void main(String[] args) {
        Random random = new Random();
        int lucky[] = {1, 2, 3, 5, 6, 7, 8};
        int luckyNull[] = {0, 1, 2, 3, 5, 6, 7, 8};
        for (int i = 0; i < 100; i++) {
            int r = random.nextInt(7);
            int r1 = random.nextInt(8);
            int r2 = random.nextInt(8);
            int shuttleNum[] = {lucky[r], luckyNull[r1], luckyNull[r2]};
            System.out.println(String.valueOf(shuttleNum[0]) + String.valueOf(shuttleNum[1]) + String.valueOf(shuttleNum[2]));
        }
    }
}