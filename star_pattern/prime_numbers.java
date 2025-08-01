package star_pattern;

public class prime_numbers {

    public static boolean isPrime(int n) {

        if (n == 1 || n == 0) {
            return false;
        }

        if (n == 2) {
            return true;
        }
        boolean isPrime = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }

        return isPrime;
    }

    public static void forRange(int from, int too) {
        int i = from;
        int n = too;
        for (; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        forRange(2, 100);

    }
}
