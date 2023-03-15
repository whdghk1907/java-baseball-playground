import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BallTest {

    Ball ball;
    Ball question;

    List<Ball> answers;
    List<Ball> questions;

    @BeforeEach
    void setBaseBall() {
        ball = new Ball(1, 1);
    };
    @Test
    @DisplayName("Strike")
    void strike() {
        question = new Ball(1,1);

        Assertions.assertTrue(ball.strike(question));
    }

    @Test
    @DisplayName("Ball")
    void ball() {
        question = new Ball(2, 1);

        Assertions.assertTrue(ball.ball(question));
    }

    @Test
    @DisplayName("Play")
    void play() {
        question = new Ball(2, 1);
        Assertions.assertEquals(BallStatus.BALL, ball.play(question));

        question = new Ball(1,1);
        Assertions.assertEquals(BallStatus.STRIKE, ball.play(question));

        question = new Ball(3, 2);
        Assertions.assertEquals(BallStatus.NOTHING, ball.play(question));
    }
}
