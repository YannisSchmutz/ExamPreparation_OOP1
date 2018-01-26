package interfaces2;

import java.awt.*;

public class RectangleMeasurer implements Measurer {
  @Override
  public double measure(Object obj) {
    Rectangle rect = (Rectangle) obj; // cast is necessary
    return rect.getWidth() * rect.getHeight(); // area
  }
}
