package ch12.MoneyTest;

/**
 * Created by declanh on 1/5/2016.
 */
class Money implements Expression{

    Money times(int multiplier){
        return new Money(amount * multiplier, currency);
    }


    Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }


    protected String currency;
    String currency() {
        return currency;
    }

    protected int amount;

    /**
     * Compares the amount of the current object, to the amount of the Dollar object that is passed in as a parameter.
     * @param object - the object to compare the current "dollar" object to.
     * @return true if the amounts are the same.
     */
    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount
                && currency().equals(money.currency());
    }

    /**
     * A factory method to create a dollar
     *
     * This will help decouple the tests from the existence of the dollar subclass
     * and also the franc subclass.
     * @param amount
     * @return
     */
    static Money dollar(int amount){
        return new Money(amount, "USD");
    }
    static Money franc(int amount){
        return new Money(amount, "CHF");
    }


    public String toString(){
        return amount + " " + currency;
    }

    /*
    public Money plus(Money addend) {
        return new Money(this.amount + amount, addend.currency());
    }
    */
    Expression plus(Money addend) {
        return new Money(this.amount + amount, addend.currency());
    }


}
