package interfaces2;

import java.awt.*;

public class DataSetMeasurerTester {

  /**
   * Main method.
   * @param args unused
   */
  public static void main(String[] args) {
    Measurer m = new RectangleMeasurer();
    DataSetMeasurer data = new DataSetMeasurer(m);
    data.add(new Rectangle(5, 10, 20, 25));
    data.add(new Rectangle(10, 20, 30, 40));
    Rectangle rect = (Rectangle) data.getMaximum();
    System.out.println(rect.getWidth()); // 30.0 expected


    Measurer m2 = new BankAccountMeasurer();
    DataSetMeasurer data2 = new DataSetMeasurer(m2);
    data2.add(new BankAccount(1000));
    data2.add(new BankAccount(2000));
    data2.add(new BankAccount(2001));
    data2.add(new BankAccount(2000));
    data2.add(new BankAccount(100));
    BankAccount bankAcc = (BankAccount) data2.getMaximum();
    System.out.println(bankAcc.getBalance()); //  expected



  }
}
