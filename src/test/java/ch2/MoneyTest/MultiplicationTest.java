package ch2.MoneyTest;

import ch2.MoneyTest.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
    public void testMultiplication1(){
        ch2.MoneyTest.Dollar five = new ch2.MoneyTest.Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
        five.times(3);
        assertEquals(15, five.amount);
    }

    /**
     * Note:
     * The Dollar implementation leaves the amount alone when there is an operation (such as multiplication).
     * This allows the test below(which does different multiplications) to function correctly. The Dollar object itself
     * does not change.
     */
    @Test
    public void testMultiplication2(){
        ch2.MoneyTest.Dollar five = new ch2.MoneyTest.Dollar(5);
        ch2.MoneyTest.Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }

}