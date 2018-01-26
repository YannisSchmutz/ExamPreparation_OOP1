package interfaces;

public class Plane implements Fly {

    @Override
    public void fly(){
        System.out.println("Flying high and fast.");
    }


    public static void main(String args[]){

        // Polymorphism (many shapes)
        // Fly f can become either an Animal or a Plane
        Fly f;
        f = new Animal();
        f.fly();    // Calls Animal.fly()
        f = new Plane();
        f.fly();    // Calls Plane.fly()

    }
}
