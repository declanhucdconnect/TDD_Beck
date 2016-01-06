package ch10.MoneyTest;

/**
 * Created by declanh on 12/28/2015.
 *
 * TODO:
 *  $5 + 10 CHF = $10 if rate is 2:1
 *  $5 * 2 = $10 <<-- XX
 *  Make "amount" private <<-- XX
 *  Dollar side effects? <<-- XX
 *  Money Rounding?
 *  equals()<<-- XX
 *  hashCode()
 *  Equal null
 *  Equal object
 *  5 CHF * 2 = 10 CHF  <<-- XX
 *  Dollar/Franc duplication  (Not quite completed yet! - dh)
 *  Common equals <<-- XX
 *  Common times
 *  Compare Francs with Dollars
 *  Currency ? <<-- XX Focus of Chapter 9 - Times We're Livin' In
 *  Delete testFrancMultiplication ?
 */

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
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }


    @Test
    public void testFrancMultiplication(){
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    public void testEquality(){
        assertTrue(Money.dollar(5).equals( Money.dollar(5)));
        assertFalse((Money.dollar(5).equals(Money.dollar(6))));

        assertTrue( Money.franc(5).equals(Money.franc(5)));
        assertFalse((Money.franc(5).equals(Money.franc(6))));

        assertFalse((Money.franc(5).equals(Money.dollar(5))));
    }

    @Test
    public void testCurrency(){
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());

    }
}
