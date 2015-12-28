package ch3.MoneyTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
        ch3.MoneyTest.Dollar five = new ch3.MoneyTest.Dollar(5);
        ch3.MoneyTest.Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }

    @Test
    public void testEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse((new Dollar(5).equals(new Dollar(6))));
    }

}
