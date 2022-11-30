package employeewage;

public class PartTime {
    public static void main(String[] args) {
        double WagePerHour=20;
        double FulldayHour=8;
        double DailyWage=0;
        double val= Math.random()*3;
        if (val<1){
            System.out.println("Employee is Absent");
            System.out.println("Wage for employee "+DailyWage);
        }
        else if (val>1 && val<2){
            System.out.println("Employee is present");
            DailyWage=WagePerHour*FulldayHour;
            System.out.println("Wage For employee"+DailyWage);
        }
        else {
            System.out.println("Employee is present for only part time ");
            DailyWage=(WagePerHour*FulldayHour)/2;
            System.out.println("Wage for Part Time Employee"+DailyWage);
        }
    }
}
