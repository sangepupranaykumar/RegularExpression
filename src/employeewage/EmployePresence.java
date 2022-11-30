package employeewage;

public class EmployePresence {
    public static void main(String[] args) {
        double val = Math.random()*2;
        if (val<1){
            System.out.println("Employee is absent");
        }
        else {
            System.out.println("Employee is present");
        }
    }
}
