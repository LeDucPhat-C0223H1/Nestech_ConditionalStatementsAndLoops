import java.util.Scanner;

public class CurrencyConverterApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double usd;
        double vnd;
        double rate = 24000;

        System.out.println("---Convert USD to VNĐ---");
        System.out.print("Input USD: ");
        usd = scanner.nextDouble();
        System.out.println("convert...");
        vnd = usd * rate;
        System.out.println("Result: " + vnd + " vnđ");
    }
}
