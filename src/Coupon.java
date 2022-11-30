import java.util.Random;

public class Coupon {
    public static void main(String[] args) {
        int winnerCouponNum = 10000;
        int couponNumber = 0;
        int couponCount = 0;

        while (couponNumber != winnerCouponNum) {
            couponNumber = generateCoupon();
            couponCount++;
            System.out.println(couponNumber);
        }
        System.out.println("winner coupon : " + couponNumber);
        System.out.println("No of coupons to match winner : " + couponCount);
    }

    static int generateCoupon() {
        int num = 0;
        Random random = new Random();
        while (num < 1000) {
            num = random.nextInt(99999);
        }
        return num;
    }
}