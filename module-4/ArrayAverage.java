// Jacob Achenbach 4/6/2025
// Module 4 Four overloaded methods that return the average of an array

public class ArrayAverage {

    // Method to calculate the average of a short array
    public static short average(short[] array) {
        short sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    // Method to calculate the average of an int array
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate the average of a long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate the average of a double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        // Test data with arrays of different sizes
        short[] shortArray = {2, 4, 6, 8};
        int[] intArray = {1, 2, 3, 4, 5};
        long[] longArray = {10L, 20L, 30L};
        double[] doubleArray = {2.5, 3.5, 4.5, 5.5, 6.5, 7.5};

        // Each method and display results
        System.out.println("Original short array: ");
        for (short num : shortArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nAverage: " + average(shortArray));

        System.out.println("\nOriginal int array: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nAverage: " + average(intArray));

        System.out.println("\nOriginal long array: ");
        for (long num : longArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nAverage: " + average(longArray));

        System.out.println("\nOriginal double array: ");
        for (double num : doubleArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nAverage: " + average(doubleArray));
    }
}
