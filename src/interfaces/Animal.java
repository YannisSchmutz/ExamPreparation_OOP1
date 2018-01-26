package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Animal implements Fly, Swim {

    @Override
    public void swim(){
        System.out.println("I'm swimming");
    }

    @Override
    public void fly(){
        System.out.println("I'm flying slow and quiet");
    }


    public static void main(String args[]){
        Animal animal = new Animal();
        animal.swim();
        animal.fly();

        // ********************************************
        Animal a = new Animal();
        Fly f;
        Swim s;

        // Todo: From Class up to Interface is NO casting needed!
        f = a;  // OK  (Animal(a) is also Fly(f))
        s = a;  // OK  (Animal(a) is also Swim(s))
        // Todo: From Interface down to Class is CASTING NEEDED!
        a = (Animal) f;  // OK      a = f; -> NOT OK    Fly(f) could also be used for a plane
        a = (Animal) s;  // OK      a = s; -> NOT OK    Swim(s) could also be used for a boat

        a.fly();
        a.swim();

        // ********************************************
        Fly f2 = new Animal();
        Animal a2 = (Animal) f2;
        Swim s2 = (Swim) f2;
        f2 = (Fly) null;  //Fly f2 = (Fly) null; -> ERROR, is already defined above...


        //Fly f3 = new Animal();
        //((Plane) f3).fly();       // Todo: -> RTE compiling ok, but casting from one class to another not possible!

        // ********************************************

        Fly test1 = new Animal();
        ArrayList<Fly> flyer = new ArrayList<Fly>();

        flyer.add(test1);

        Animal test2 = new Animal();
        flyer.add(test2);

        for (Fly t : flyer){
            t.fly();
            // t.swim();  -> NOT POSSIBLE
        }


    }
}
