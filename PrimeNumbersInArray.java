public class PrimeNumbersInArray {
    public static void main(String[] args) {
        int[] intArr = {10, 11, 13, 15, 17, 19, 23, 25, 30};

        for (int num : intArr) {
            if (isPrime(num)) {
                System.out.println(num + " - Prime");
            } else {
                System.out.println(num + " - Not Prime");
            }
        }
    }

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
