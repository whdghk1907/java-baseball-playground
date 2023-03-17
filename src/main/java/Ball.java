import java.util.List;

public class Ball {
    private final int location;
    private final int number;

    public Ball(int location, int number) {
        BallUtils util = new BallUtils();

        this.location = util.validateLocation(location);
        this.number = util.validateNumber(number);
    }


    public boolean strike(Ball question) {

        return this.location == question.location && this.number == question.number;
    }

    public boolean ball(Ball question) {
        return this.location != question.location && this.number == question.number;
    }

    public BallStatus play(Ball question) {
        if(this.strike(question)) {
            return BallStatus.STRIKE;
        }
        if(this.ball(question)){
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }
}
