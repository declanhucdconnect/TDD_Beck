package ch3.MoneyTest;

/**
 * Created by declanh on 12/28/2015.
 *
 * TODO:
 *  $5 + 10 CHF = $10 if rate is 2:1
 *  $5 * 2 = $10
 *  Make "amount" private
 *  Dollar side effects?
 *  Money Rounding?
 *  equals()
 *  hashCode()
 *  Equal null
 *  Equal object
 */
public class Dollar {
    int amount;

    Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }

    Dollar (int dollar){
        this.amount = dollar;
    }

    /**
     * Compares the amount of the current object, to the amount of the Dollar object that is passed in as a parameter.
     * @param object - the object to compare the current "dollar" object to.
     * @return true if the amounts are the same.
     */
    public boolean equals(Object object){
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }
}
