package linecomparision;



public class Length {
    public static void main(String[] args) {
        int x1 = 10, y1 = 8;
        int x2 = 5, y2 = 9;

        int l1 = x2-x1;
        int l2 = y2-y1;
        double length = Math.sqrt((l1*l1)+(l2*l2));
        //int length = Math.sqrt((Math.pow(x2-x1),2)+(Math.pow((y2-y1),2)));
        System.out.println("Length of the line is ="+length);
    }
}
