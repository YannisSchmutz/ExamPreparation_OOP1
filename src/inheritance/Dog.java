package inheritance;

public class Dog extends Animal{


    public Dog(String color){
        super(color); // Calls constructor of superclass
    }

    // Override a method
    @Override
    public void move(){
        System.out.println("The " + color + " dog is moving");
        //super.move();  // Call superclass method
        //super.move(1); // Call the overloaded superclass method
    }

    // Dog can bark, animal does not support it
    public void bark(){
        System.out.println("The " + color + " dog is barking");
    }

    public void eat(){
        System.out.println("The " + color + " dog is eating");
    }


    public static void main(String args[]){

        Dog dog1 = new Dog("Black");
        dog1.move();

        Animal animal1;
        // animal: Static type is Animal, dynamic type is Dog
        animal1 = new Dog("White");  // TODO: Up-cast (implicit / stillschweigend). Dog is also an Animal
        animal1.eat();   // The subclass (Dog's) functions are called...
        animal1.move();  // Invocation is based on the dynamic type.
        //animal1.bark();  // todo: Whether a method can be invoked is determined by the static type. Here: Animal
        ((Dog)animal1).bark();  // But like this , it works

        // Downcast
        Dog dog2 = (Dog)animal1; // TODO: Down-cast (explicit) animal could be everything. NEEDS CAST.
        dog2.move();
        dog2.bark();

        System.out.println(dog2 instanceof Dog);
        System.out.println(dog2 instanceof Animal);

    }
}
