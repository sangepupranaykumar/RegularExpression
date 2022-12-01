package logicalprogramssix;

public class CouponNumber {
    public static void main(String[] args) {
        char[] characters = "abcXYZ123456789".toCharArray();
        int max=100000000;
        int random=(int) (Math.random()*max);
        StringBuffer stringbuffer = new StringBuffer();

        while (random>0)
        {
            stringbuffer.append(characters[random % characters.length]);
            random = random/ characters.length;
        }

        String couponCode=stringbuffer.toString();
        System.out.println("Coupon Code: "+couponCode);
    }
    }

