public class StringManipulation {

    /*
    Splits the front part of a string into a substring and "multiplies" it.
     */
    public String frontTimes(String str, int n) {
        String res = "";
        String tmp = "";
        int splitter = 3;
        if(str.length() < 3){
            splitter = str.length();
        }
        tmp = str.substring(0, splitter);  // E.g "Chocolate".substring(0, 3) -> "Cho"
        for(int i=0;i<n;i++){
            res += tmp;
        }

        return res;
    }

    /*
    Counts how often two chars (x) are side by side as pair.

    countXX("abcxx") -> 1
    countXX("xxx") -> 2
     */
    int countXX(String str) {
        int counter = 0;
        int n = str.length();
        for (int i = 1; i < n; i++){
            if(str.charAt(i-1) == 'x' && str.charAt(i-1) == str.charAt(i)){
                counter++;
            }
        }
        return counter;
    }


    public static void main(String args[]){


    }
}
