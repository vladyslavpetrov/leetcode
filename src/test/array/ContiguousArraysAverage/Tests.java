package array.ContiguousArraysAverage;

import array.ContigousArraysAverage.Solution;
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
    public void testArrayAverage(int[] input, int k, double[] expected) {
        double[] output = solution.findAverage(input, k);
        Assertions.assertArrayEquals(expected, output);
    }

    private static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new int[]{ 1, 3, 2, 6, -1, 4, 1, 8, 2 }, 5, new double[]{2.2, 2.8, 2.4, 3.6, 2.8}),
                Arguments.of(new int[]{ 1, 3, 2, 6, -1}, 5, new double[]{2.2}),
                Arguments.of(new int[]{ 1, 3, 2, 6, -1}, 1, new double[]{1.0, 3.0, 2.0, 6.0, -1.0})
        );
    }
}
