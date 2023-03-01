import java.util.Scanner;

public class StringCalculator {

    public int calculateString() throws Exception {
        Scanner sc = new Scanner(System.in);

        String value = sc.nextLine();
        String[] values = seperate(value);

        int result = toInt(values[0]);

        for (int i = 0; i < values.length - 2; i += 2) {
            int firstValue = result;
            int secondValue = toInt(values[i + 2]);
            char operator = values[i + 1].charAt(0);

            result = calculate(firstValue, secondValue, operator);
        }

        return result;
    }

    public int toInt (String arr) {
        return Integer.parseInt(arr);
    }
    public String[] seperate(String str) {
        return str.split(" ");
    }

    public int calculate(int first, int second, char operator) throws Exception {
        if(operator == '+') {
            return add(first, second);
        }

        if(operator == '-') {
            return subtract(first, second);
        }

        if(operator == '*') {
            return multiply(first, second);
        }

        if(operator == '/') {
            return divide(first, second);
        }

        throw new Exception("잘못된 값 입력");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
