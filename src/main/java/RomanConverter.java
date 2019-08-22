import java.util.*;

import static java.util.Collections.*;
import static java.util.stream.Collectors.*;

class RomanConverter {

    private static final Map<Integer, String> romanSymbols = new HashMap<>() {{
        put(1, "I");
        put(4, "IV");
        put(5, "V");
        put(9, "IX");
        put(10, "X");
    }};

    private static final List<Integer> romanValues = romanSymbols.keySet().stream()
            .sorted(reverseOrder())
            .collect(toList());

    static String convert(int arabicValue) {
        for (Integer romanValue : romanValues)
            if (arabicValue >= romanValue)
                return romanSymbols.get(romanValue) + convert(arabicValue - romanValue);

        return "";
    }
}
