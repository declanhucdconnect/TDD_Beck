package ch9.MoneyTest;


public class Dollar extends Money {

    Money times(int multiplier){
        return Money.dollar(amount * multiplier);
    }

    /*
    @Override
    String currency() {
        return currency;
    }

    private String currency;
*/

    Dollar(int amount, String currency){
       super(amount, currency);
    }

    /**
     * Compares the amount of the current object, to the amount of the Dollar object that is passed in as a parameter.
     * @param object - the object to compare the current "dollar" object to.
     * @return true if the amounts are the same.
     */
    /*
    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount;
    }
    */
}
