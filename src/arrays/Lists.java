package arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {


    public static void basicListHandling(){

        ArrayList<String> list = new ArrayList<String>();

        list.add("red");  // Add elements sequentially
        list.add("blue");
        list.add("green");
        System.out.println(list);

        list.add(0, "something");  // Add element at pos x

        for(String s : list){  // Loop trough list
            System.out.println(s);
        }

        System.out.println(String.format("Item at pos 2: %s", list.get(2)));  // Get element of pos x

        list.set(0, "yellow");  // Update element at pos x
        System.out.println(list);

        list.remove(2);  // Remove element at pos x
        System.out.println(list);
    }

    public static void searchForElement(){

        ArrayList<String> list = new ArrayList<String>();

        list.add("red");  // Add elements sequentially
        list.add("blue");
        list.add("green");
        System.out.println(list);

        if (list.contains("red")){   // Check if element is in lis
            System.out.print("List contains red at position ");
            System.out.println(list.indexOf("red"));    // Get index of the element
        }
    }

    public static void sortList(){

        ArrayList<String> list = new ArrayList<String>();

        list.add("red");  // Add elements sequentially
        list.add("blue");
        list.add("green");
        list.add("white");
        list.add("black");
        System.out.println(list);

        Collections.sort(list);  // Sorts the list
        System.out.println(list);
    }



    public static void main(String args[]){

        basicListHandling();

        searchForElement();

        sortList();

    }
}
