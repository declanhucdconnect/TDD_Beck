package ch6.MoneyTest;

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
 *  Dollar/Franc duplication
 *  Common equals<<-- XX Focus of this Chapter (Ch6) - Equality for All, Redux
 *  Common times
 */

import ch6.MoneyTest.Dollar;
import ch6.MoneyTest.Franc;
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
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }


    @Test
    public void testFrancMultiplication(){
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }

    @Test
    public void testEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse((new Dollar(5).equals(new Dollar(6))));

        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse((new Franc(5).equals(new Franc(6))));
    }

}
