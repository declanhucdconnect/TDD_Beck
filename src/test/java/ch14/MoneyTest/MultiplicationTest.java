package ch14.MoneyTest;


/**
 * Created by declanh on 12/28/2015.
 *
 * TODO:
 *  $5 + 10 CHF = $10 if rate is 2:1 <<---XX
 *  $5 + $5 = $10  << --- XX
 *  Return Money from $5 + $5
 *  Bank.reduce(Money) << --- XX
 *  Reduce Money with conversion << --- XX Focus on Chapter 14 - "Change"
 *  Reduce(Bank, String)
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

    @Test
    public void testPlusReturnsSum() {
        Money five = Money.dollar(5);
        Expression result = five.plus(five);
        Sum sum = (Sum) result;
        assertEquals(five, sum.augend);
        assertEquals(five, sum.addend);
    }

    @Test
    public void testReduceSum(){
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(7), result);
    }

    /**
     * p64 Test reduce when the parameter is a "Money" - at the moment, as implemented, it is an Expression object
     */
    @Test
    public void testReduceMoney(){
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(1), "USD");
        assertEquals(Money.dollar(1), result);
    }

    /**
     * P 67
     */
    @Test
    public void testReduceMoneyDifferentCurrency(){
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(Money.franc(2), "USD");
        assertEquals(Money.dollar(1), result);
    }

    @Test
    public void testArrayEquals() {
        assertEquals( new Object[] {"abc"}, new Object[] {"abc"});
    }

    @Test
    public void testIdentityRate() {
        assertEquals(1, new Bank().rate("USD", "USD"));
    }

}
