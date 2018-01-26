package lambdas;

import java.util.ArrayList;

public class LambdaPersonArrayList {


    public static void main(String [] args){

        ArrayList<Person> persons = new ArrayList<Person>();

        persons.add(new Person(1, "Foo Bar"));
        persons.add(new Person(2, "Ab Cd"));
        persons.add(new Person(3, "Ef Gh"));
        persons.add(new Person(4, "Ij Kl"));
        persons.add(new Person(5, "Mn Op"));

        persons.forEach(p -> System.out.println(String.format("id:%s, Name:%s", p.getPid(), p.getName())));

        persons.forEach(p -> p.setName("***" + p.getName() + "***"));
        persons.forEach(p -> System.out.println(String.format("id:%s, Name:%s", p.getPid(), p.getName())));

        persons.removeIf(p -> p.getPid()%2 == 0);
        persons.forEach(p -> System.out.println(String.format("id:%s, Name:%s", p.getPid(), p.getName())));

    }
}
