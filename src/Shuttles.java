import java.util.Random;

public class Shuttles {
    public static void main(String[] args) {
        Random random = new Random();
        int[] lucky = {1, 2, 3, 5, 6, 7, 8};
        int[] luckyNull = {0, 1, 2, 3, 5, 6, 7, 8};
        for (int i = 0; i < 100; i++) {
            int[] shuttleNum = {lucky[random.nextInt(7)], luckyNull[random.nextInt(8)], luckyNull[random.nextInt(8)]};
            System.out.println(String.valueOf(shuttleNum[0]) + shuttleNum[1] + shuttleNum[2]);
        }
    }
}