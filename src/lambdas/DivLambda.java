package lambdas;
import java.util.ArrayList;
import java.util.List;


public class DivLambda {



    public static void main(String args[]){

        //List<String> strings = new com.sun.tools.javac.util.List<>();
        List<String> strings = new ArrayList<String>();

        strings.add("axbc");
        strings.add("xyz");
        strings.add("");
        strings.add("blxub");

        strings.replaceAll(s -> s + "*");

        System.out.println(strings);

        strings.replaceAll(s -> s.toUpperCase());
        System.out.println(strings);

        strings.replaceAll(s -> s.toLowerCase());

        //String result = yourString.replaceAll("[-+.^:,]","");
        strings.replaceAll(s -> s.replaceAll("[x]",""));  // Removes all x
        System.out.println(strings);

    }
}
