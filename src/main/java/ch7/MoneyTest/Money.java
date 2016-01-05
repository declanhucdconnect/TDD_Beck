package ch7.MoneyTest;

/**
 * Created by declanh on 1/3/2016.
 */
public class Money {
    // private int amount;

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
}
