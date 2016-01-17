package ch13.MoneyTest;

/**
 * Created by declanh on 1/17/2016.
 */
public class Sum implements Expression{
    Money augend;
    Money addend;

    public Sum(Money money, Money addend) {
        this.augend = money;
        this.addend = addend;
    }

    /**
     * p 64 - moving reduce to Sum, from Bank.).
     * @param to
     * @return
     */
    public Money reduce (String to){
        int amount = augend.amount + addend.amount;
        return new Money(amount, to);
    }
}
