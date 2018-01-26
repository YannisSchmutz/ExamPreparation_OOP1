package lambdas;

//import number2.BankAccount;

import java.util.Arrays;

import static java.lang.Character.getNumericValue;

public class ArraySort {


    public static void main(String[] args) {

        String[] words = { "hi", "hello", "hola", "bye", "goodbye", "adios" };
        System.out.println("Original array: " + Arrays.asList(words)); // sorting by length ascending ...
        Arrays.sort(words, (s1, s2) -> s1.length() - s2.length());
        System.out.println("Sorted by length ascending: " + Arrays.asList(words)); // sort string array

        Arrays.sort(words, (s1, s2) -> s2.length() - s1.length());
        System.out.println("Sorted by length descending: " + Arrays.asList(words));

        Integer[] ints = {1,3,2,4,6,5,9,90,5,11,34,12,10,19};

        Arrays.sort(ints);
        System.out.println("Sorted by value ascending: " + Arrays.asList(ints));

        Arrays.sort(ints, (x,y) -> y-x);    // Sort int array
        System.out.println("Sorted by value descending: " + Arrays.asList(ints));

        Arrays.sort(ints, (x,y) ->  getNumericValue(Integer.toString(x).charAt(0)) - getNumericValue(Integer.toString(y).charAt(0)));
        System.out.println("Sorted by value ascending: " + Arrays.asList(ints));

        Arrays.sort(ints, (x,y) ->  getNumericValue(Integer.toString(y).charAt(0)) - getNumericValue(Integer.toString(x).charAt(0)));
        System.out.println("Sorted by value descending: " + Arrays.asList(ints));

        /*
        number2.BankAccount[] accounts = {
                new BankAccount(1000),
                new BankAccount(2000),
                new BankAccount(500),
                new BankAccount(600),
        };

        Arrays.sort(accounts, (x,y) -> (int)x.getBalance() - (int)y.getBalance());
        Arrays.asList(accounts).forEach(a -> System.out.println(String.format("Account balance: %s", a.getBalance()) ));

        */

    }
}
