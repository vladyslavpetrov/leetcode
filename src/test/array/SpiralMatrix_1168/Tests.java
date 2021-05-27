package array.SpiralMatrix_1168;


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
    public void testSpiralMatrix(int[][] input, List<Integer> expected) {
        List<Integer> output = solution.spiralOrder(input);
        Assertions.assertEquals(expected, output);
    }

    private static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}}, Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7)),
                Arguments.of(new int[][]{{1,2}, {2,1}, {0,0}}, Arrays.asList(1,2,1,0,0,2)),
                Arguments.of(new int[][]{{1,2}}, Arrays.asList(1,2)),
                Arguments.of(new int[][]{{1}}, Collections.singletonList(1)),
                Arguments.of(new int[][]{{}}, Collections.emptyList()),
                Arguments.of(null, Collections.emptyList())
        );
    }
}
