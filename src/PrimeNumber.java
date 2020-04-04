public class PrimeNumber {
    public static void main(String[] args) {
        for ( int n = 2; n <= 100; n++) {
            boolean checkPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    checkPrime = false;
                    break;
                }
            }
            if (checkPrime) {
                System.out.println(n);
            }
        }
    }
}