import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BaseBallTest {

    BaseBall baseBall;
    BaseBall question;

    List<BaseBall> answers;
    List<BaseBall> questions;

    @BeforeEach
    void setBaseBall() {
        baseBall = new BaseBall(1, 1);
    };
    @Test
    @DisplayName("Strike")
    void strike() {
        question = new BaseBall(1,1);

        Assertions.assertTrue(baseBall.strike(question));
    }

    @Test
    @DisplayName("Ball")
    void ball() {
        question = new BaseBall(2, 1);

        Assertions.assertTrue(baseBall.ball(question));
    }

    @Test
    @DisplayName("Play")
    void play() {
        question = new BaseBall(2, 1);
        Assertions.assertEquals(BallStatus.BALL, baseBall.play(question));

        question = new BaseBall(1,1);
        Assertions.assertEquals(BallStatus.STRIKE, baseBall.play(question));

        question = new BaseBall(3, 2);
        Assertions.assertEquals(BallStatus.NOTHING, baseBall.play(question));
    }
}
