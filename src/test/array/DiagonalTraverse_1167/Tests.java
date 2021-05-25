package array.DiagonalTraverse_1167;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
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
    public void testTraverse(int[][] input, int[] expected) {
        int[] actual = solution.findDiagonalOrder(input);

        Assertions.assertArrayEquals(expected, actual);
    }

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}}, new int[]{1,2,4,7,5,3,6,8,9}),
                Arguments.of(new int[][]{{1,2}, {3,4}, {5,6}, {7,8}}, new int[]{1,2,3,5,4,6,7,8}),
                Arguments.of(new int[][]{{1}, {2}, {3}, {4}, {5}}, new int[]{1,2,3,4,5}),
                Arguments.of(new int[][]{}, new int[0]),
                Arguments.of(null, new int[0])
        );
    }
}
