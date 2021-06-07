package array.TripletSumCloseToTarget;

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
        this.solution = new Solution();
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void testTripleSumCloseToTarget(int[] input, int targetSum, int expected) {
        int output = solution.searchTriplet(input, targetSum);

        Assertions.assertEquals(expected, output);
    }

    private static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new int[]{-2, 0, 1, 2}, 2, 1),
                Arguments.of(new int[]{-3, -1, 1, 2}, 1, 0),
                Arguments.of(new int[]{1, 0, 1, 1}, 100, 3),
                Arguments.of(new int[]{1,2}, 3, -1),
                Arguments.of(null, 5, -1)
        );
    }
}
