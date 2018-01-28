package big_decimal;

public class CashRegisterTester {

    public static void main(String[] args) {
        CashRegister register = new CashRegister();


        /* Test 2 */
        register.recordPurchase(0.75);
        register.recordPurchase(1.50);
        register.payDollars(2);
        register.payDimes(3);
        System.out.println(String.format("Change: %s", register.giveChange ( )));
        System.out.println("Expected: 0.05");

        System.out.println(String.format("Change 4 dollars to quarters. Expecting 16, receiving: %s", register.changeToQuarters(4)));


    }
}