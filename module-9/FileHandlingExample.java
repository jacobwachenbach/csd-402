// jacob Achenbach 4/27/2025

// Program creates a file named data.file if it doesn't exist, writes 10 random integers to the file, then reads and displays the contents of the file.

import java.io.*;
import java.util.Random;

public class FileHandlingExample {
    public static void main(String[] args) {
        String filename = "data.file";
        File file = new File(filename);

        // Create file if it doesn't exist
        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            // Open file for appending data
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Random random = new Random();

            // Write 10 random numbers to the file
            System.out.println("Writing 10 random numbers to the file...");
            for (int i = 0; i < 10; i++) {
                int randomNumber = random.nextInt(100);  // Generate a random number between 0 and 99
                bufferedWriter.write(randomNumber + " ");  // Write the number to the file
            }
            bufferedWriter.newLine();  // Add a new line after the numbers
            bufferedWriter.close();  // Close the BufferedWriter

            // Reopen the file and read the data
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            System.out.println("Contents of the file:");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();  // Close the BufferedReader
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
