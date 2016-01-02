package ch5.MoneyTest;


public class Dollar {

    private int amount;

    Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }

    Dollar(int dollar){
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
