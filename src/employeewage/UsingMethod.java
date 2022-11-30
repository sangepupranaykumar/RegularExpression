package employeewage;

public class UsingMethod {
   static int empWagePerHour = 20;
    static int fullDayHour = 8;
    static int halfDayHour = 4;
    static int salary = 0;
    static int totalSalary = 0;
    static int totalWorkingDays = 20;
    static int days =0;
    static int totalWorkingHours = 0;
     void computeEmpWage() {
        while (days != totalWorkingDays && totalWorkingHours != 100) {

            double val = Math.random() * 3;
            int data = (int) Math.floor(val);
            switch (data) {
                case 0:
                    System.out.println("Employee is Absent.");
                    break;
                case 1:
                    System.out.println("Employee is Present.");
                    salary = empWagePerHour * fullDayHour;
                    totalWorkingHours = totalWorkingHours + fullDayHour;
                    break;
                case 2:
                    System.out.println("Present for Half Day");
                    salary = empWagePerHour * halfDayHour;
                    totalWorkingHours = totalWorkingHours + halfDayHour;
            }
            System.out.print("random: " + data + "\t");
            System.out.print("Working Hours: " + totalWorkingHours + "\t");
            System.out.print("\tSalary is: " + salary + "\t");
            totalSalary = totalSalary + salary;
            days++;
        }

    }
     void displayTotalSalary(){
    System.out.println("Total Salary: "+totalSalary);
    }

    public static void main(String[] args) {
        UsingMethod obj = new UsingMethod();
obj.computeEmpWage();
    }
}