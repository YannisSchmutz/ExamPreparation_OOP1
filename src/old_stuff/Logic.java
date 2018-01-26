package old_stuff;

public class Logic {



    public static void main(String [] args){

        //xor = ungleich
        //(a && !b) || (!a && b)
        int a = 12;
        int b = 13;
        boolean x = (13 <= a && a <= 19);
        boolean y = (13 <= b && b <= 19);
        boolean value = ((x && !y) || (!x && y));

        //xnor = gleich
        // (a && b) || (!a && !b)

        // Absolute value
        System.out.println(Math.abs(3-5));
    }
}
