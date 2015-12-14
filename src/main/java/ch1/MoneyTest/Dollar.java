package ch1.MoneyTest;

/**
 * Created by declanh on 12/14/2015.
 */
public class Dollar {

    int amount;

    void times(int multiplier){
        this.amount *= multiplier;
    }

    Dollar (int dollar){
        this.amount = dollar;
    }


}
