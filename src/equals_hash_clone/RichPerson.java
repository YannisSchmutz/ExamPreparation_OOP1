package equals_hash_clone;

public class RichPerson extends Person {

    private int money;

    public RichPerson(String name, int age, int money){
        super(name, age);
        this.money = money;
    }


    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }

        if (getClass() !=obj.getClass()){
            return false;
        }
        if(!super.equals(obj)){
            return false;
        }
        RichPerson other = (RichPerson) obj;
        return money == other.money;
    }
}
