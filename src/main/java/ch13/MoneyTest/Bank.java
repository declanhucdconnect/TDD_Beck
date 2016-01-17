package ch13.MoneyTest;

/**
 * Created by declanh on 1/16/2016.
 */
public class Bank {

    /**
     * p 63 - issues with code:
     * a) Cast (from Expression to Sum)
     * b) public fields - i.e. the augend and addend are publicly visible in the code.
     *
     * @param source
     * @param to
     * @return
     */
    Money reduce (Expression source, String to){
        /*
        // int amount = sum.augend.amount + sum.addend.amount;
        // return new Money(amount, to);

        if ( source instanceof Money) {
            return (Money) source.reduce(to);
        }
        Sum sum = (Sum) source;
        */
        return source.reduce(to);
    }
}
