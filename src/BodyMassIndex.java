import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight;
        double height;
        System.out.println("----Body Mass Index----");
        System.out.print("Input your weight (kg): ");
        weight = scanner.nextDouble();
        System.out.print("Input your height (m): ");
        height = scanner.nextDouble();

        double bmi;
        bmi = weight / Math.pow(height, 2);
        System.out.printf("BMI: %.3f \n", bmi);

        if (bmi < 18.5) {
            System.out.println("Interpretation: Underweight");
        }
        if (18.5 <= bmi && bmi < 25.0) {
            System.out.println("Interpretation: Normal");
        }
        if (25.0 <= bmi && bmi < 30.0) {
            System.out.println("Interpretation: Overweight");
        }
        if (bmi >= 30) {
            System.out.println("Interpretation: Obese");
        }

    }
}