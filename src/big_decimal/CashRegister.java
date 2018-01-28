package big_decimal;

import java.math.BigDecimal;

/** A simple cash register that totals up purchases and computes change. */
public class CashRegister {
    //public static final double PENNY_VALUE = 0.01;
    public static final BigDecimal PENNY_VALUE = new BigDecimal("0.01");
    //public static final double NICKEL_VALUE = 0.05;
    public static final BigDecimal NICKEL_VALUE = new BigDecimal("0.05");
    //public static final double DIME_VALUE = 0.10;
    public static final BigDecimal DIME_VALUE = new BigDecimal("0.10");
    //public static final double QUARTER_VALUE = 0.25;
    public static final BigDecimal QUARTER_VALUE = new BigDecimal("0.25");

    //private double purchase;
    private BigDecimal purchase = BigDecimal.ZERO;
    //private double payment;
    private BigDecimal payment = BigDecimal.ZERO;

    /**
     * Record purchase of an item.
     *
     * @param amount price of the item
     */
    public void recordPurchase(double amount) {

        //purchase += amount;

        BigDecimal a = BigDecimal.valueOf(amount);
        System.out.println(String.format("Amount: %s", a));

        this.purchase = this.purchase.add(a);
        System.out.println(String.format("Purchase: %s", purchase));
    }

    /*
    public void payCash(int dollars, int quarters, int dimes, int nickels, int pennies) {
        this.payment = dollars + QUARTER_VALUE * quarters + DIME_VALUE * dimes + NICKEL_VALUE * nickels
                + PENNY_VALUE * pennies;
    }
    */

    public void payDollars(int dollar){

        payment = this.payment.add(new BigDecimal(dollar));
    }

    public void payQuarters(int quarters){

        BigDecimal real_quarter = new BigDecimal(quarters).multiply(QUARTER_VALUE);

        payment = this.payment.add(real_quarter);
    }


    public void payDimes(int dimes){

        BigDecimal real_dimes = new BigDecimal(dimes).multiply(DIME_VALUE);

        payment = payment.add(real_dimes);
    }

    public void payNickles(int nickles){

        BigDecimal real_nickles = new BigDecimal(nickles).multiply(NICKEL_VALUE);

        payment = payment.add(real_nickles);

    }
    public void payPennies(int pennies){

        BigDecimal real_pennies = new BigDecimal(pennies).multiply(PENNY_VALUE);

        payment = payment.add(real_pennies);
    }
    /**
     * Finish purchase and return change.
     *
     * @return change due to customer
     */
    public BigDecimal giveChange() {
        BigDecimal change = this.payment.subtract(this.purchase);

                //- purchase;
        purchase = BigDecimal.ZERO;
        payment = BigDecimal.ZERO;
        return change;
    }

    /**
     * Change dollars to quarters.
     *
     * @param dollars amount in dollars to change
     * @return number of quarters
     */
    public BigDecimal changeToQuarters(int dollars) {

        BigDecimal dollars2 = new BigDecimal(dollars);

        return dollars2.divide(QUARTER_VALUE);

    }
}
