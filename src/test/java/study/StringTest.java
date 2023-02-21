package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void splitTest() {
        String[] splitTest = "1,2".split(",");
        assertThat(splitTest).containsExactly("1", "2");
    }

    @Test
    void splitTest2() {
        String[] splitTest = "1".split(",");
        assertThat(splitTest).containsExactly("1");
    }

    @Test
    void splitTest3() {
        String[] splitTest = "1".split(",");
        assertThatThrownBy(() -> {
            String test = splitTest[1];
        })
        .isInstanceOf(ArrayIndexOutOfBoundsException.class)
        .hasMessage("Index 1 out of bounds for length 1");
    }

    @Test
    void substringTest() {
        String substringTest = "(1,2)".substring(1, 4);
        assertThat(substringTest).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt Method Test")
    void charAtTest() {
        assertThatThrownBy(() -> {
            char charAtTest = "1,2".charAt(3);
        })
        .isInstanceOf(IndexOutOfBoundsException.class)
        .hasMessage("String index out of range: 3");
    }

}
