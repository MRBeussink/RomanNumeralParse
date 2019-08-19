import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanToIntTransformerTest {

    @Test
    public void parseTest() {
        RomanToIntTransformer tester = new RomanToIntTransformer();

        // assert statements
        assertEquals("III must be 3", 3, tester.parse("III"));
        assertEquals("IV must be 4", 4, tester.parse("IV"));
        assertEquals("IX must be 9", 9, tester.parse("IX"));
        assertEquals("LVIII must be 58", 58, tester.parse("LVIII"));
        assertEquals("MCMXLIV must be 1994", 1994, tester.parse("MCMXCIV"));
    }



}