package string.StringCompression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Tests {
    private Solution solution;

    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void testCompression(String input, String expected) {
        String actual = solution.compress(input);
        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of("aabcccccaaa", "a2b1c5a3"),
                Arguments.of("aa", "a2"),
                Arguments.of("aaaccccccccccccccccc", "a3c17"),
                Arguments.of("a", "a"),
                Arguments.of("aabcccccaaachtrywq", "aabcccccaaachtrywq")
        );
    }
}
