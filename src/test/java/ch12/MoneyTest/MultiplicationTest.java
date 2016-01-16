package ch12.MoneyTest;

/**
 * Created by declanh on 12/28/2015.
 *
 * TODO:
 *  $5 + 10 CHF = $10 if rate is 2:1 <<---XX Focus for Ch12 Addition, Finally
 *  $5 + $5 = $10  <<---XX A simpler test to represent progress
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

    /**
     * Beck recommends getting rid of this - however I'm okay with it remaining.
     * It tests your static methods - though may be burdensome to keep.
     * You could argue that it is in GitHub - but you don't want new developers always checking GitHub, or whatever code
     * repository that you use, so that they can find if ever code was written for some reason and is there.
     * Tests are cheap to run - at least this one is - so it remains for now.
     */
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
        assertFalse((Money.franc(5).equals(Money.dollar(5))));
    }

    @Test
    public void testCurrency(){
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());

    }

    @Test
    public void testSimpleAddition(){
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals( Money.dollar(10), reduced);
    }

}
