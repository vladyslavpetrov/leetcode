package array.PascalsTriangle_1170;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Tests {
    private Solution solution;

    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void testPascalTriangle(int input, List<List<Integer>> expected) {
       List<List<Integer>> output = solution.generate(input);
        Assertions.assertEquals(expected, output);
    }

    private static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(5, Arrays.asList(
                        Collections.singletonList(1),
                        Arrays.asList(1, 1),
                        Arrays.asList(1, 2, 1),
                        Arrays.asList(1, 3, 3, 1),
                        Arrays.asList(1, 4, 6, 4, 1))
                ),
                Arguments.of(1, Collections.singletonList(Collections.singletonList(1)))
        );
    }
}
