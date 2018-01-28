package equals_hash_clone;

public class Monkey implements Cloneable{

    private String color;

    public Monkey(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    @Override
    public Monkey clone(){
        try {
            return (Monkey)super.clone();
        } catch (CloneNotSupportedException e){
            return null;
        }
    }

    /*
     * Normal clone (shallow copy) does not copy objects referenced by the clone
     * Deep copy does!
     *
     *
     *
     */

    public static void main(String args[]){
        Monkey m1 = new Monkey("Brown");
        Monkey mc2 = m1.clone();
        System.out.println(mc2.getColor());

    }
}

