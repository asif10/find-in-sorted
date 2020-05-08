package uk.co.azteksolutions.sort;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Asif Akhtar
 * 08/05/2020 00:32
 */
class FindInSortedArrayTest {

    static Stream<Arguments> shouldFindPositionInArray() {
        return Stream.of(
                itemIsInTheMiddle(),
                itemIsInTheLast()
        );
    }

    private static Arguments itemIsInTheMiddle() {
        return Arguments.of("item is in the middle", 2, new int[]{4, 5, 6, 7, 8}, 6);
    }

    private static Arguments itemIsInTheLast() {
        int max=1000;
        return Arguments.of("item is in the last position", max, IntStream.rangeClosed(0,max).toArray(), max);
    }

    @DisplayName("should find the position in the array...")
    @MethodSource
    @ParameterizedTest(name = "{0}")
    void shouldFindPositionInArray(String description, int expectedPosition, int[] values, int value) {
        int position = new FindInSortedArray().findPositionUsingMidRange(values, value);
        assertEquals(expectedPosition, position);
    }
}