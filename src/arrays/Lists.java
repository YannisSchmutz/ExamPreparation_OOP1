package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {


    public static void basicListHandling(){
        System.out.println("*********************************");

        ArrayList<String> list = new ArrayList<String>();

        list.add("red");  // Add elements sequentially
        list.add("blue");
        list.add("green");
        System.out.println(list);

        list.add(0, "something");  // Add element at pos x

        for(String s : list){  // Loop trough list
            System.out.println(s);
        }

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));    // Loop trough list 2
        }

        System.out.println(String.format("Item at pos 2: %s", list.get(2)));  // Get element of pos x

        list.set(0, "yellow");  // Update/replace element at pos x
        System.out.println(list);

        list.remove(2);  // Remove element at pos x
        System.out.println(list);

        list.removeAll(list);  // Empty list fully
        System.out.println(list);

        System.out.println("Is list empty?: " + list.isEmpty());  // Check if list is empty
        // System.out.println(list.get(0));  // This would throw a java.lang.IndexOutOfBoundsException
    }

    public static void searchForElement(){
        System.out.println("*********************************");

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
        System.out.println("*********************************");

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

    public static void copyListInAnother(){
        System.out.println("*********************************");
        List<String> List1 = new ArrayList<String>();
        List1.add("1");
        List1.add("2");
        List1.add("3");
        List1.add("4");
        System.out.println("List1: " + List1);
        List<String> List2 = new ArrayList<String>();
        List2.add("A");
        List2.add("B");
        List2.add("C");
        List2.add("D");
        System.out.println("List2: " + List2);
        // Copy List1 to List2
        Collections.copy(List1, List2);
        System.out.println("Copy List to List2,\nAfter copy:");
        System.out.println("List1: " + List1);
        System.out.println("List2: " + List2);
    }

    public static void shuffleList(){
        System.out.println("*********************************");
        List<String> List1 = new ArrayList<String>();
        List1.add("1");
        List1.add("2");
        List1.add("3");
        List1.add("4");

        Collections.shuffle(List1);  // shuffle list

        System.out.println(List1);
    }

    public static void reverseList(){
        System.out.println("*********************************");
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("1 Red");
        list_Strings.add("2 Green");
        list_Strings.add("3 Orange");
        list_Strings.add("4 White");
        list_Strings.add("5 Black");
        System.out.println("List before reversing :\n" + list_Strings);
        Collections.reverse(list_Strings);
        System.out.println("List after reversing :\n" + list_Strings);
    }


    public static List getPartOfList(int start, int end){
        System.out.println("*********************************");
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("1 Red");
        list_Strings.add("2 Green");
        list_Strings.add("3 Orange");
        list_Strings.add("4 White");
        list_Strings.add("5 Black");

        List<String> subList = list_Strings.subList(start, end);
        return subList;

    }

    public static void swapTwoElements(){
        System.out.println("*********************************");
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("1 Red");
        list_Strings.add("2 Green");
        list_Strings.add("3 Orange");
        list_Strings.add("4 White");
        list_Strings.add("5 Black");

        Collections.swap(list_Strings, 0, 4);  // Swap elements in list
    }

    public static void joinTwoLists(){
        System.out.println("*********************************");
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("List of first array: " + c1);
        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        System.out.println("List of second array: " + c2);

        // Let join above two list
        ArrayList<String> a = new ArrayList<String>();
        a.addAll(c1);
        a.addAll(c2);
        System.out.println("New array: " + a);
    }

    public static void cloneArrayList(){
        System.out.println("*********************************");
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);
        ArrayList<String> newc1 = (ArrayList<String>)c1.clone();
        System.out.println("Cloned array list: " + newc1);

    }

    public static void trimToCurrentSize(){
        System.out.println("*********************************");
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);
        System.out.println("Let trim to size the above array: ");
        c1.trimToSize();
        System.out.println(c1);

    }


    public static void increaseListSize(){
        System.out.println("*********************************");
        ArrayList<String> c1= new ArrayList<String>(3);  // Note that size is set to 3
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");

        System.out.println("Original array list: " + c1);
        //Increase capacity to 6
        c1.ensureCapacity(6);
        c1.add("White");
        c1.add("Pink");
        c1.add("Yellow");
        System.out.println("New array list: " + c1);
    }


    public static void main(String args[]){

        basicListHandling();

        searchForElement();

        sortList();

        copyListInAnother();

        shuffleList();

        reverseList();


        System.out.println(getPartOfList(1,3));

        joinTwoLists();

        cloneArrayList();

        trimToCurrentSize();

        increaseListSize();

    }
}
