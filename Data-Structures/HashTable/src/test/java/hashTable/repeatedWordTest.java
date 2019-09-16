package hashTable;

import org.junit.Test;
import static org.junit.Assert.*;

public class repeatedWordTest {
    @Test
    public void testRepeatedWord() {
        assertEquals("the", repeatedWord.repeatedWordCheck("The the the first word duplicate is The"), "the");
    }
    @Test
    public void testRepeatedWordSafe() {
        assertEquals("the", repeatedWord.repeatedWordCheck("The the"), "the");
        assertEquals("b", repeatedWord.repeatedWordCheck("A B AA B AA BBAB"), "b");
        assertEquals("No duplicates", repeatedWord.repeatedWordCheck("A B ACA BL ADA CBBAB"), "");
    }
    @Test
    public void testRepeatedWordEdge() {
        assertEquals("Empty input", repeatedWord.repeatedWordCheck(""), "");
        assertEquals("the", repeatedWord.repeatedWordCheck("The? the."), "the");
    }
}
