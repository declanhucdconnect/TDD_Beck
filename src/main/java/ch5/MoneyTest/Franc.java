package ch5.MoneyTest;

public class Franc {

    private int amount;

    Franc times(int multiplier){
        return new Franc(amount * multiplier);
    }

    Franc(int franc){
        this.amount = franc;
    }

    /**
     * Compares the amount of the current object, to the amount of the Dollar object that is passed in as a parameter.
     * @param object - the object to compare the current "dollar" object to.
     * @return true if the amounts are the same.
     */
    public boolean equals(Object object){
        Franc franc = (Franc) object;
        return amount == franc.amount;
    }
}
