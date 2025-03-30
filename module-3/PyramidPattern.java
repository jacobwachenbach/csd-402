// Jacob Achenbach 3/30/2025
// Number Pyramid with @ symbols going straight vertical

public class PyramidPattern {
    public static void main(String[] args) {
        int totalRows = 7;
        int fixedWidth = 35;
        
        // Loop through each row (1-indexed)
        for (int i = 1; i <= totalRows; i++) {
            StringBuilder line = new StringBuilder();
            
            // Calculate and print leading spaces.
            // For row 1 we add one extra space so that the single "1" aligns with the rest.
            int leadSpaces = (i == 1) ? ((totalRows - i) * 2 + 1) : ((totalRows - i) * 2);
            for (int s = 0; s < leadSpaces; s++) {
                line.append(" ");
            }
            
            // Print the increasing part: from 2^0 to 2^(i-1)
            for (int j = 0; j < i; j++) {
                line.append((int) Math.pow(2, j));
                // Add a space after the number if it isn't the last number in the increasing sequence.
                if (j != i - 1) {
                    line.append(" ");
                }
            }
            
            // Print the decreasing part: from 2^(i-2) down to 2^0
            for (int j = i - 2; j >= 0; j--) {
                line.append(" ");  // prepend a space before each number in the decreasing part
                line.append((int) Math.pow(2, j));
            }
            
            // Compute how many trailing spaces to add so that the left portion has a constant width.
            int currentLength = line.length();
            int trailingSpaces = fixedWidth - currentLength;
            for (int s = 0; s < trailingSpaces; s++) {
                line.append(" ");
            }
            
            // Append the '@' symbol
            line.append("@");
            
            // Print the completed line.
            System.out.println(line.toString());
        }
    }
}
