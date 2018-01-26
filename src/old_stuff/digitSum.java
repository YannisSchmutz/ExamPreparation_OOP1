package old_stuff;

public class digitSum {

    public void dings(){
        System.out.println("dings");
    }

    public static void main(String [] args){
        int n = 1111;

        int sum = 0;
        while(true){
            int i = n%10;
            if(n==0){
                break;
            }
            sum = i + sum;
            n = n/10;
        }
        digitSum d = new digitSum();
        d.dings();

        System.out.println(sum);

    }
}
