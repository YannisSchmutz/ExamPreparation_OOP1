package enums;


public class Main {

    public enum Season{
        SPRING, SUMMER, AUTUMN, WINTER;
    }


    public enum Months{

        JANUARY(1, 31, Season.WINTER), FEBRUARY(2, 29, Season.WINTER), MARCH(3, 31, Season.SPRING), APRIL(4, 30, Season.SPRING),
        MAY(5, 31, Season.SPRING), JUNE(5, 30, Season.SUMMER), JULY(6, 31, Season.SUMMER), AUGUST(8, 31, Season.SUMMER),
        SEPTEMBER(9, 30, Season.AUTUMN), OCTOBER(10, 31, Season.AUTUMN), NOVEMBER(11, 30, Season.AUTUMN), DECEMBER(12, 31, Season.WINTER);


        private int code;
        private int days;
        private Season season;

        private Months(int code, int days, Season season){
            this.code = code;
            this.days = days;
            this.season = season;
        }

        public int getCode() {
            return code;
        }

        public int getDays(){
            return days;
        }

        public Season getSeason(){
            return season;
        }

        public Months getMonth(int code){

            return Months.values()[code-1];
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }


    public static void main(String[] args){

        System.out.println("Enuminator\n");

        /*
        Months jan = Months.JANUARY;
        System.out.println(jan.toString());
        System.out.println(jan.getCode());
        System.out.println(jan.getDays());
        System.out.println(jan.getSeason());
        System.out.println(jan.getMonth(7));
        */

        for(Months m : Months.values()){
            System.out.println(String.format("%10s - Month %2d Number of days: %2d", m.toString(), m.getCode(), m.getDays()));
        }

        System.out.println("Summer months:");
        for (Months m : Months.values()){
            if (m.season == Season.SUMMER){
                System.out.println(m.toString());
            }
        }



    }
}
