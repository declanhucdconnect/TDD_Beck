package ch14.MoneyTest;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

/**
 * Created by declanh on 1/16/2016.
 */



public class Bank {

    private Hashtable rates = new Hashtable();

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
        return source.reduce(this, to);
    }

    int rate (String from, String to) {
        // return ( from.equals("CHF")&& to.equals("USD")?2 :1);

        if ( from.equals(to)) return 1; // P70

        // p70 implementation
        Integer rate = (Integer) rates.get(new Pair(from,to));
        return rate.intValue();
    }

    /**
     * P70
     */
    void addRate( String from, String to, int rate){
        rates.put(new Pair(from,to), new Integer(rate));
    }



}
