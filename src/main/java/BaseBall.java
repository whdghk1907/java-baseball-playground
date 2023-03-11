import java.util.Scanner;

public class BaseBall {

    public static final String answer = "456";

    int result;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void keepPlay() {
        if(getResult() != 3) {
            baseBall();
        }
    }

    public void baseBall() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요 : ");

        String input = sc.nextLine();
        char[] numbers = input.toCharArray();
        char[] answers = answer.toCharArray();

        checkStrike(numbers, answers);
        checkBall(numbers, answers);
    }


    public void checkStrike(char[] numbers, char[] answers) {
        int strike = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == answers[i]) {
                strike++;
                setResult(strike);
                break;
            }
        }
        printRestult("스트라이크", strike);
        keepPlay();
    }

    public void checkBall(char[] numbers, char[] answers) {
        int ball = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != answers[i]) {
                for (int j = 0; j < answers.length; j++) {
                    if (numbers[j] == answers[j]) {
                        ball++;
                        break;
                    }
                }
            }
        }
        printRestult("볼", ball);
        keepPlay();
    }

    public void printRestult(String result, int number){

        if(number != 0){
            System.out.print(number + " " + result);
        }
    }
}
