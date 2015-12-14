package ch1.MoneyTest;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by declanh on 12/14/2015.
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
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}