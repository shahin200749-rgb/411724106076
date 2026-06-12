public class June08 {
    public static void printFactors(int num) {
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(i);

                if (i != num / i) {
                    System.out.println(num / i);
                }
            }
        }
    }

    public static void main(String[] args) {
        printFactors(36);
    }
}