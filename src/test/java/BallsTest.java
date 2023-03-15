import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class BallsTest {

    Balls balls;

    @BeforeEach
    public void setBalls() {
        balls = new Balls(Arrays.asList(7,1,5));
    };

    @Test
    @DisplayName("Balls")
    public void balls() {
        List<Integer> questions = Arrays.asList(4,5,6);

        Balls balls = new Balls(questions);

        Assertions.assertEquals(Arrays.asList(1,2,3), balls.getLocations());
        Assertions.assertEquals(Arrays.asList(4,5,6), balls.getNumbers());
    }

    @Test
    @DisplayName("End")
    public void end() {
        Balls questions = new Balls(Arrays.asList(7,1,5));

        Assertions.assertEquals(GameStatus.END, balls.play(questions));
    }

    @Test
    @DisplayName("Continue")
    public void notEnd() {
        Balls questions = new Balls(Arrays.asList(7,1,9));

        Assertions.assertEquals(GameStatus.CONTINUE, balls.play(questions));
    }
}
