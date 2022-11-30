package employeewage;

public class ConditionProgram {
    public static void main(String[] args) {
        int empWagePerHour = 20;
        int fullDayHour = 8;
        int halfDayHour = 4;
        int salary = 0;
        int totalSalary = 0;
        int totalWorkingDays = 20;
        int days =0;
        int totalWorkingHours = 0;
        while(days != totalWorkingDays && totalWorkingHours != 100)
        {

double val = Math.random()*3;
int data = (int)Math.floor(val);
        switch(data)
            {
                case 0: System.out.println("Employee is Absent.");
                    break;
                case 1: System.out.println("Employee is Present.");
                    salary = empWagePerHour * fullDayHour ;
                    totalWorkingHours = totalWorkingHours + fullDayHour;
                    break;
                case 2: System.out.println("Present for Half Day");
                    salary = empWagePerHour * halfDayHour ;
                    totalWorkingHours = totalWorkingHours + halfDayHour;
            }
            System.out.print("random: "+data+"\t");
            System.out.print("Working Hours: "+totalWorkingHours+"\t");
            System.out.print("\tSalary is: "+salary+"\t");
            totalSalary = totalSalary + salary;
            days++;
        }
        System.out.println("Total Salary: "+totalSalary);

    }
}
