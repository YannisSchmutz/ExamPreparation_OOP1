package inheritance;

public class Animal {

    public String color;


    public Animal(String color){

        this.color = color;
    }

    public void move(){
        System.out.println("Animal is moving");
    }

    // Overloading
    public void move(int meters){
        System.out.println(String.format("Moving %d meters", meters));
    }

    public void eat(){
        System.out.println("Animal is eating");
    }

}
