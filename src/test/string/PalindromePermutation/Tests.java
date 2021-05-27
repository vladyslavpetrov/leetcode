package string.PalindromePermutation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
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
    public void testPalindromePermutation(String input, boolean expected) {
        boolean output = solution.isPalindromePermutation(input);
        Assertions.assertEquals(expected, output);
    }

    private static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of("tactcoa", true),
                Arguments.of("Tactcoa", true),
                Arguments.of("akk", true),
                Arguments.of("aa", true),
                Arguments.of("kactcoa", false),
                Arguments.of("ka", false),
                Arguments.of("", false)
        );
    }
}
