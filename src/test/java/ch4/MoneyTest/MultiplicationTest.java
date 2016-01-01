package ch4.MoneyTest;

import ch4.MoneyTest.Dollar;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by declanh on 12/28/2015.
 */
public class MultiplicationTest {

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @Test
    public void testMultiplication(){
        ch4.MoneyTest.Dollar five = new ch4.MoneyTest.Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testEquality(){
        assertTrue(new ch4.MoneyTest.Dollar(5).equals(new ch4.MoneyTest.Dollar(5)));
        assertFalse((new ch4.MoneyTest.Dollar(5).equals(new Dollar(6))));
    }

}
