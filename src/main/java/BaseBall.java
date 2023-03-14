public class BaseBall {
    private final int location;
    private final int number;

    public BaseBall(int location, int number) {
        this.location = location;
        this.number = number;
    }


    public boolean strike(BaseBall question) {
        return this.location == question.location && this.number == question.number;
    }

    public boolean ball(BaseBall question) {
        return this.location != question.location && this.number == question.number;
    }

    public BallStatus play(BaseBall question) {
        if(this.strike(question)) {
            return BallStatus.STRIKE;
        }
        if(this.ball(question)){
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }
}
