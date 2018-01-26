package interfaces2;

public class DataSetMeasurer {
  private int count;
  private Object maximum;
  private Measurer measurer;

  /**
   * Construct a number2.DataSetMeasurer from a given number2.Measurer object.
   * 
   * @param m the given object
   */
  public DataSetMeasurer(Measurer m) {
    this.count = 0;
    this.maximum = null;
    this.measurer = m;
  }

  /**
   * Adds an object to the number2.DataSetMeasurer.
   * 
   * @param x the new object
   */
  public void add(Object x) {
    if (this.count == 0 || this.measurer.measure(this.maximum) < this.measurer.measure(x)) {
      this.maximum = x;
      System.out.println(String.format("Max: %s", this.measurer.measure(x)));
    }
    this.count++;
  }

  public Object getMaximum() {

    return this.maximum;
  }
}
