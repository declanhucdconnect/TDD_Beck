package ch14.MoneyTest;

/**
 * Created by declanh on 1/16/2016.
 */
public interface Expression {
    Money reduce(Bank bank, String to);
}
