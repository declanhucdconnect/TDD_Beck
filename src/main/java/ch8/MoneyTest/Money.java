package ch8.MoneyTest;

/**
 * Created by declanh on 1/5/2016.
 */
abstract class Money {
    abstract Money times(int multiplier);

    protected int amount;

    /**
     * Compares the amount of the current object, to the amount of the Dollar object that is passed in as a parameter.
     * @param object - the object to compare the current "dollar" object to.
     * @return true if the amounts are the same.
     */
    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

    /**
     * From Chapter 8 - eliminate subclass references
     * @param amount
     * @return
     */
    /*
    static Dollar dollar(int amount){
        return new Dollar(amount);
    }
    */

    /**
     * A factory method to create a dollar
     *
     * This will help decouple the tests from the existence of the dollar subclass
     * and also the franc subclass.
     * @param amount
     * @return
     */
    static Money dollar(int amount){
        return new Dollar(amount);
    }
    static Money franc(int amount){
        return new Franc(amount);
    }

}
