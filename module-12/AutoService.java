public class AutoService {

    // Service charge
    static final double STANDARD_CHARGE = 100.0;

    // No parameters (only standard service charge)
    public static double yearlyService() {
        return STANDARD_CHARGE;
    }

    // One parameter (standard charge + oil change fee)
    public static double yearlyService(double oilChangeFee) {
        return STANDARD_CHARGE + oilChangeFee;
    }

    // Two parameters (standard charge + oil change + tire rotation)
    public static double yearlyService(double oilChangeFee, double tireRotationFee) {
        return STANDARD_CHARGE + oilChangeFee + tireRotationFee;
    }

    // Three parameters (standard charge + oil change + tire rotation - coupon discount)
    public static double yearlyService(double oilChangeFee, double tireRotationFee, double couponDiscount) {
        return STANDARD_CHARGE + oilChangeFee + tireRotationFee - couponDiscount;
    }

    public static void main(String[] args) {
        // Test each twice

        // yearlyService() with no parameters
        System.out.println("Standard Service Charge: $" + yearlyService());
        System.out.println("Standard Service Charge Again: $" + yearlyService());

        // yearlyService() with one parameter (oil change fee)
        System.out.println("Service Charge with Oil Change Fee: $" + yearlyService(50.0));
        System.out.println("Service Charge with Oil Change Fee Again: $" + yearlyService(50.0));

        // yearlyService() with two parameters (oil change fee and tire rotation fee)
        System.out.println("Service Charge with Oil Change and Tire Rotation: $" + yearlyService(50.0, 30.0));
        System.out.println("Service Charge with Oil Change and Tire Rotation Again: $" + yearlyService(50.0, 30.0));

        // yearlyService() with three parameters (oil change fee, tire rotation fee, coupon discount)
        System.out.println("Service Charge with Oil Change, Tire Rotation, and Coupon: $" + yearlyService(50.0, 30.0, 20.0));
        System.out.println("Service Charge with Oil Change, Tire Rotation, and Coupon Again: $" + yearlyService(50.0, 30.0, 20.0));
    }
}
