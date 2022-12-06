package logicalprogramssix;

public class PrimeNumber {
    public static void main(String[] args) {
        int num =7;
        int temp=0;
        for (int i=2; i<=num-1;i++){
                if (num%i==0){
                    temp = temp+1;
            }
        }
        if (temp>0){
            System.out.println("Number is not prime");
        }
        else {
            System.out.println("Number is Prime Number");
        }
    }
}
