import java.util.Scanner;

public class DisplayGeometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        while (choice != 4) {
            System.out.println("----Menu Display Geometry----");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the squape triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit!");
            System.out.print("Enter number: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    drawTheReactangle();
                    System.out.println();
                    break;
                case 2:
                    drawTheSquareTriangle();
                    System.out.println();
                    break;
                case 3:
                    drawTheIsoscelesTriangle();
                    System.out.println();
                    break;
                case 4:
                    choice = 4;
                    System.out.println("____End program____");
                    break;
                default:
                    System.out.println("Please re-enter");
                    System.out.println();
            }
        }
    }

    private static void drawTheIsoscelesTriangle() {
        for (int i = 0; i < 6; i++) {
            // In ra khoảng trắng để căn lề bên trái của tam giác
            for (int j = 0; j < 6 - i; j++) {
                System.out.print("a");
            }
            // In ra các ký tự '*' tạo thành tam giác
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawTheSquareTriangle() {
        // square at top-left
        for (int i = 0; i < 6; i++) {
            for (int j = i; j < 6 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // square at bottom-left
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // square at top-right
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < 6 - i; k ++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // square at bottom-right
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j < 6 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < i + 1; k ++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void drawTheReactangle() {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 7; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
