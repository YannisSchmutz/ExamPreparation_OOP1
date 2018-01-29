package old_stuff;

public class StringManipulations {




    public static void main(String [] args){

        String str = "This is some text!";
        String[] str_array = str.split("[ ]+");

        String str2 = " starts and ends with a space ";
        //System.out.println(str2);
        str2 = str2.trim(); // removes spaces at the beginning and end.
        //System.out.println(str2);

        //Remove part of string
        String str3 = "OneVeryLongWord";
        int n = 3; // Char position to start remove
        int k = 7; // Char position to end remove
        String front = str3.substring(0, n);  // [0;n[
        String back = str3.substring(k, str3.length());
        System.out.println(front + back);

        // Specific char at
        String str4 = "0123456789";
        char c = str4.charAt(3);
        System.out.println(c);

        //Starts with
        String str5 = "Blub or bleb?";
        boolean starts = str5.startsWith("Blub");
        System.out.println(starts);


        // Equals
        System.out.println("abc".equals("abc"));

        //Count letters in string
        int count = 0;
        String str6 = "Abcde abcde ee";
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'e') count++; // NOTE: use '' not "" for charAt!
            // alternately: str.substring(i, i+1).equals("e")
        }

        //Count words in string
        int count_word = 0;
        String str7 = "abhi hi pqhiih";
        for(int i = 1; i < str7.length(); i++){
            if(str.substring(i-1,i+1).equals("hi")){
                count_word++;
            }
        }

        // Uppercase
        System.out.println("abcd".toUpperCase());



    }
}
