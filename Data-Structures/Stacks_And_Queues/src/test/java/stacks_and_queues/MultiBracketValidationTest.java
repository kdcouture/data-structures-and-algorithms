package stacks_and_queues;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MultiBracketValidationTest {
    MultiBracketValidation test;

    @Before
    public void testInit() {
        test = new MultiBracketValidation();
    }

    @Test
    public void testSimpleSafe() {
        assertTrue("Should be true", test.validate("[]"));
    }
    @Test
    public void testSimpleSafe2() {
        assertTrue("Should be true", test.validate("()"));
    }
    @Test
    public void testSimpleSafe3() {
        assertTrue("Should be true", test.validate("{}"));
    }

    @Test
    public void testSimpleBad() {
        assertFalse("Should be false", test.validate("[["));
    }
    @Test
    public void testSimpleBad2() {
        assertFalse("Should be false", test.validate("{]"));
    }
    @Test
    public void testSimpleBad3() {
        assertFalse("Should be false", test.validate("))"));
    }

    @Test
    public void testComplexSafe() {
        assertTrue("Should be true", test.validate("({[]{[()]}()})"));
    }

    @Test
    public void testComplexBad() {
        assertFalse("Should be false", test.validate("({[]{[()]}()}"));
    }

    @Test
    public void testComplexSafeWithWords() {
        assertTrue("Should be true", test.validate("([T()E]{S}T)C[00]l"));
    }

    @Test
    public void testComplexSafeWithWords2() {
        assertTrue("Should be true", test.validate("{}{Code}[Fellows](())"));
    }

}
