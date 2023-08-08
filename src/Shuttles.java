public class Shuttles {
    public static void main(String[] args) {
        int shuttleNum = 1;
        for (int i = 0; i < 100; i++) {
            System.out.println(shuttleNum);
            shuttleNum++;
            if ((shuttleNum - 4) % 10 == 0) {
                shuttleNum++;
            }
            if ((shuttleNum - 9) % 10 == 0) {
                shuttleNum++;
            }
            if ((shuttleNum - 100 * (shuttleNum / 100)) / 10 == 4) {
                shuttleNum += 10;
            }
            if ((shuttleNum - 100 * (shuttleNum / 100)) / 10 == 9) {
                shuttleNum += 10;
            }
        }
    }
}