import java.util.ArrayList;
import java.util.List;

public class Balls {
    private final List<Integer> locations;
    private final List<Integer> numbers;
    public Balls(List<Integer> questions) {
        BallUtils utils = new BallUtils();
        this.locations = new ArrayList<>();
        int size = questions.size();

        utils.validateLocation(size);

        for (int i = 1; i <= questions.size(); i++) {
            this.locations.add(i);

            int question = questions.get(i - 1);
            utils.validateNumber(question);
        }

        this.numbers =questions;
    }

    public List<Integer> getLocations() {
        return this.locations;
    }

    public List<Integer> getNumbers() {
        return this.numbers;
    }

    public int size() {
        return this.locations.size();
    }

    public int getLocation(int location) {
        return this.locations.get(location);
    }

    private int getNumber(int index) {
        return this.numbers.get(index);
    }

    private Ball getBall(int i) {
        int location = getLocation(i);
        int number = getNumber(i);

        return new Ball(location, number);
    }

    private Ball getBall(int i, Balls questions) {
        int location = questions.getLocation(i);
        int number = questions.getNumber(i);

        return new Ball(location, number);
    }
    public GameStatus play(Balls questions) {
        List<BallStatus> result = new ArrayList<>();

        for(int i = 0; i < this.size(); i++) {
            Ball answer = getBall(i);
            Ball question = getBall(i, questions);

            BallStatus ballStatus = answer.play(question);
            result.add(ballStatus);
        }
        return isEnd(result);
    }

    private GameStatus isEnd(List<BallStatus> result) {
        if(strikeCount(result) >= 3){
            return GameStatus.END;
        }
        return GameStatus.CONTINUE;
    }

    private int strikeCount(List<BallStatus> result) {
        return Math.toIntExact(
                result
                    .stream()
                    .filter(ballStatus -> ballStatus.equals(BallStatus.STRIKE))
                    .count()
        );
    }
}
