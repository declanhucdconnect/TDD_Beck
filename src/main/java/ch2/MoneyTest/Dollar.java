package ch2.MoneyTest;

/**
 * Created by declanh on 12/28/2015.
 */
public class Dollar {
    int amount;

    Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }

    Dollar (int dollar){
        this.amount = dollar;
    }


}