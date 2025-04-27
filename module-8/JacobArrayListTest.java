// Jacob W. Achenbach 4/27/2025

// Simple program that takes numbers until a 0 is inputed and then will show the highest number.


import java.util.ArrayList;
import java.util.Scanner;

public class JacobArrayListTest {

    // Method to find the largest value in the ArrayList
    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        Integer max = list.get(0);  // Start with the first element
        for (Integer num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Take user input until a 0 is entered
        System.out.println("Enter integers. Enter 0 to stop:");

        while (true) {
            int input = scanner.nextInt();
            numbers.add(input);
            if (input == 0) {
                break;
            }
        }

        // Call the max method to find the largest number in the ArrayList
        Integer largestValue = max(numbers);

        // Display the result
        System.out.println("The largest value is: " + largestValue);
    }
}
