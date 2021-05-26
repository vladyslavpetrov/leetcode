package string.StringPermutation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Tests {

    Solution solution;

    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void testPermutation(String first, String second, boolean expected) {
        Assertions.assertEquals(expected, solution.checkPermutation(first, second));
    }

    private static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of("god", "dog", true),
                Arguments.of("surprise", "irusrpes", true),
                Arguments.of("s", "s", true),
                Arguments.of("ab", "ba", true),
                Arguments.of("cv", "cv", true),
                Arguments.of("Dog", "dog", false),
                Arguments.of("ret", "rett", false),
                Arguments.of("track", "tracc", false),
                Arguments.of("", "", false),
                Arguments.of("word", null, false)
        );
    }
}
