package abstract_class;

public class Circle extends Figure {

    @Override
    public void draw(){
        System.out.println("Circle draw");
    }

    public static void test(){
        System.out.println("Circle test");
    }


    public static void main(String args[]){
        Figure fc = new Circle();
        fc.test();  // Calls the method in abstract class (Figure) probably because it is static...
        fc.draw();  // Calls circles draw

        System.out.println("");

        Circle c = new Circle();
        c.test();   // both circle methods
        c.draw();

    }
}
