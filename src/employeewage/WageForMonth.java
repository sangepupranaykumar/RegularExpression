package employeewage;

public class WageForMonth {
    public static void main(String[] args) {
        double WagePerHour=20;
        double FulldayHour=8;
        double WorkingDayperMonth=20;
        double DailyWage=0;
        double Monthlysalary=0;
        for (int i = 1; i<=20; i++){
        double val= Math.random()*3;
        int data = (int) Math.floor(val);
        switch (data){
            case 0:
                System.out.println("Employee is Absent");
                System.out.println("Wage for employee"+DailyWage);
                break;
            case 1:
                System.out.println("Employee is present");
                DailyWage=WagePerHour*FulldayHour;
               // Monthlysalary = DailyWage*WorkingDayperMonth;
                System.out.println("Wage For employee "+DailyWage);
                break;
            case 2:
                System.out.println("Employee is present for only part time ");
                DailyWage=(WagePerHour*FulldayHour)/2;
               // Monthlysalary = DailyWage*WorkingDayperMonth;
                System.out.println("Wage for Part Time Employee "+DailyWage);
                break;
        }
    }
}}
