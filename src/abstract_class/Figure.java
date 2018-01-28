package abstract_class;


/*
* Not possible to create an object of an abstract class
* If one or more method is abstract, the class must be to
* Abstract methods can not contain an implementation (some code)
* There can be non-abstract methods too (with implementation)
*


 */

public abstract class Figure {

    private int xPos;
    private int yPos;

    /** Draws Figure onto Canvas. */
    public abstract void draw();

    public final void setPosX(int x) {
        xPos = x;
    }

    public final int getPosX() {
        return xPos;
    }

    public final void setPosY(int y) {
        yPos = y;
    }

    public final int getPosY() {
        return yPos;
    }
}

