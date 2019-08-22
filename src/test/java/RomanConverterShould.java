import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanConverterShould {
    @ParameterizedTest
    @MethodSource("arabicToRomanTests")
    void convert_arabic_numbers(int arabic, String roman) {
        assertEquals(roman, RomanConverter.convert(arabic));
    }

    private static Stream<Arguments> arabicToRomanTests() {
        return Stream.of(
                Arguments.of(1, "I"),
                Arguments.of(2, "II"),
                Arguments.of(3, "III"),
                Arguments.of(4, "IV"),
                Arguments.of(5, "V"),
                Arguments.of(6, "VI"),
                Arguments.of(9, "IX"),
                Arguments.of(10, "X"),
                Arguments.of(14, "XIV"),
                Arguments.of(19, "XIX")
        );
    }
}
