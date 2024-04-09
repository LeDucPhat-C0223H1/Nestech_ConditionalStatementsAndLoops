public class TheFirst20PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        System.out.println("20 số nguyên tố đầu tiên: ");
        while (count < 20) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count ++;
            }
            number ++;
        }
    }

    public static boolean isPrime(int number) {
        if (number <=1 ) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
