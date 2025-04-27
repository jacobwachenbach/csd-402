// jacob Achenbach 4/27/2025

// Program creates an ArrayList of 10 strings, prints the elements using a for-each loop, prompts the user for an index, and attempts to print the selected element, handling invalid indices with a try/catch block.


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList with 10 Strings
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grape");
        list.add("Honeydew");
        list.add("Indian Fig");
        list.add("Jackfruit");

        // Print all elements using a for-each loop
        System.out.println("ArrayList elements:");
        for (String item : list) {
            System.out.println(item);
        }

        // Ask the user for the index of the element they'd like to see again
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the element you want to see again (0-9): ");
        int index = scanner.nextInt();

        // Attempt to print the selected element with try-catch
        try {
            String element = list.get(index);  // Attempt to get the element at the given index
            System.out.println("Element at index " + index + ": " + element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: Out of Bounds");
        }
    }
}
