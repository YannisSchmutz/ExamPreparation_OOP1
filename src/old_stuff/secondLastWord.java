package old_stuff;

public class secondLastWord {

    public String myVersion(String str){
        str = "fasf asf f    as";

        String[] str_array = str.split("[ ]+");

        int array_lenght = str_array.length;
        if (array_lenght < 2){
            return "";
        }
        String ret_str = str_array[array_lenght-2];

        // Fails if there are two spaces in a row
        return ret_str;
    }

    public String teacherVesion(String str){
        str = str.trim();
        System.out.println();
        int endPos = str.lastIndexOf("");
        //while (endPos -1 > 0 && str.charAt())

        return "";
    }

    public static void main(String [] args){
        secondLastWord slw = new secondLastWord();
        String str = slw.myVersion("Some text blub");
        System.out.println(str);
    }
}
