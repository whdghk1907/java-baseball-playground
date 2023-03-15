public class Ball {
    private final int location;
    private final int number;

    public Ball(int location, int number) {
        this.location = location;
        this.number = number;
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
