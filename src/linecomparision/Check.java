package linecomparision;

public class Check {

        static int x1 = 2, x2 = 3, x3 = 4, x4 = 5;
        static int y1 = 2, y2 = 3, y3 = 4, y4 = 5;
        static int l1 = x2 - x1;
        static int l2 = y2 - y1;
        static int l3 = x4 - x3;
        static int l4 = y4 - y3;

    public static void main(String[] args) {


            double length1 = Math.sqrt((l1 * l1) + (l2 * l2));
            double length2 = Math.sqrt((l3 * l3) + (l4 * l4));
            if (length1 == length2) {
                System.out.println("Lines are equal");
            } else if(length1>length2)
            {
                System.out.println("Line1 is greater");}
            else {
                    System.out.println("Line1 is smaller");
                }
            }
        }
