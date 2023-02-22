import java.util.Scanner;

public class StringCalculator {

    public int calculate() {
        Scanner sc = new Scanner(System.in);

        int result = 0;

        String value = sc.nextLine();
        String[] values = value.split(" ");

        for (int i = 0; i < values.length; i++) {
            result += Integer.parseInt(values[i]);
        }

        return result;
    }
}
