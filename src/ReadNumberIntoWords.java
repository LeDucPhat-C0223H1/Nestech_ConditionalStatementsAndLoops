import java.util.Scanner;

public class ReadNumberIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Nhập số: ");
            int number = scanner.nextInt();

            String result = "";
            if (number < 10) {
                result = readOneDigitNumber(number);
            }
            if (number >= 10 && number < 20) {
                result = readTwoDigitNumberLessThan20(number);
            }
            if (number >= 20 && number < 100) {
                result = readTwoDigitNumberGreaterThanOrEqual20(number);
            }
            if (number >= 100) {
                result = readThreeDigitNumber(number);
            }
            System.out.println("Đọc thành chữ: " + result + "\n");
        }
    }

    private static String readThreeDigitNumber(int number) {
        int hundreds = number / 100;
        int tens = number % 100;
        String resultTens="";
        String resultHunderds="";
        switch (hundreds) {
            case 1:
                resultHunderds = "One hundred";
                break;
            case 2:
                resultHunderds = "Two hundred";
                break;
            case 3:
                resultHunderds = "Three hundred";
                break;
            case 4:
                resultHunderds = "Four hundred";
                break;
            case 5:
                resultHunderds = "Five hundred";
                break;
            case 6:
                resultHunderds = "Six hundred";
                break;
            case 7:
                resultHunderds = "Seven hundred";
                break;
            case 8:
                resultHunderds = "Eight hundred";
                break;
            case 9:
                resultHunderds = "Nine hundred";
                break;
        }
        if(tens == 0 ) {
            return resultHunderds;
        }
        else if(tens<20) {
            resultTens = readTwoDigitNumberLessThan20(tens);
            return resultHunderds + " and " + resultTens;
        }else {
            resultTens = readTwoDigitNumberGreaterThanOrEqual20(tens);
            return resultHunderds + " and " + resultTens;
        }
    }
    private static String readTwoDigitNumberGreaterThanOrEqual20(int number) {
        int tens = number / 10;
        int ones = number % 10;
        String resultOnes="";
        String resultTens="";
        switch (tens) {
            case 2:
                resultTens = "Twenty";
                break;
            case 3:
                resultTens = "Thirty";
                break;
            case 4:
                resultTens = "Fourty";
                break;
            case 5:
                resultTens = "Fifty";
                break;
            case 6:
                resultTens = "Sixty";
                break;
            case 7:
                resultTens = "Seventy";
                break;
            case 8:
                resultTens = "Eighty";
                break;
            case 9:
                resultTens = "Ninety";
                break;
        }
        if (ones != 0) {
            resultOnes = readOneDigitNumber(ones);
            return resultTens + " " + resultOnes;
        }else {
            return resultTens;
        }

    }

    private static String readTwoDigitNumberLessThan20(int number) {
        int ones = number % 10;
        String result = "";
        switch (ones) {
            case 0:
                result = "Ten";
                break;
            case 1:
                result = "Eleven";
                break;
            case 2:
                result = "Twelve";
                break;
            case 3:
                result = "Thirteen";
                break;
            case 4:
                result = "Fourteen";
                break;
            case 5:
                result = "Fifteen";
                break;
            case 6:
                result = "Sixteen";
                break;
            case 7:
                result = "Seventeen";
                break;
            case 8:
                result = "Eighteen";
                break;
            case 9:
                result = "Nineteen";
                break;
        }
        return result;
    }

    public static String readOneDigitNumber(int number){
        String result = "";
        switch (number) {
            case 0:
                result = "Zero";
                break;
            case 1:
                result = "One";
                break;
            case 2:
                result = "Two";
                break;
            case 3:
                result = "Three";
                break;
            case 4:
                result = "Four";
                break;
            case 5:
                result = "Five";
                break;
            case 6:
                result = "Six";
                break;
            case 7:
                result = "Seven";
                break;
            case 8:
                result = "Eight";
                break;
            case 9:
                result = "Nine";
                break;
        }
        return result;
    }

}
