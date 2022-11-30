package employeewage;

public class DailyWage {
    public static void main(String[] args) {
        double WagePerHour=20;
        double FulldayHour=8;
        double DailyWage=0;
        double val= Math.random()*2;
        if (val<1){
            System.out.println("Employee is Absent");
            System.out.println("Wage for employee "+DailyWage);
        }
        else {
            System.out.println("Employee is present");
            DailyWage=WagePerHour*FulldayHour;
            System.out.println("Wage For employee"+DailyWage);
        }
    }
}
