package equals_hash_clone;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    /*
     * "==" checks identity
     * "x.equals(y)" checks equality
     */
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass())
        {
            return false;
        }
        Person other = (Person)obj;  // Downcast needed
        if(age != other.age){
            return false;
        }
        if (name == null){
            if(other.name != null){
                return false;
            }
        } else if (!name.equals(other.name)){
            return false;
        }

        return true;
    }



    public static void main(String args[]){
        Person p1 = new Person("Bob", 45);
        Person p2 = new Person("Charlie", 45);
        Person p3 = new Person("Bob", 50);
        Person p4 = new Person("Bob", 45);

        System.out.println(p1.equals(p1));  // true
        System.out.println(p1.equals(p2));  // false
        System.out.println(p1.equals(p3));  // false
        System.out.println(p1.equals(p4));  // true

        System.out.println("");

        RichPerson rp1 = new RichPerson("Bob", 45, 100);
        RichPerson rp2 = new RichPerson("Kurt", 45, 100);
        RichPerson rp3 = new RichPerson("Bob", 45, 100);

        System.out.println(p1.equals(rp1));  // false
        System.out.println(rp1.equals(p1));  // false
        System.out.println(rp1.equals(rp2));  // false
        System.out.println(rp1.equals(rp3));  // true
    }
}
