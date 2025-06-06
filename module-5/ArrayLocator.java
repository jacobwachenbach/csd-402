// Jacob Achenbach 4/13/2025

// Simple scan for 2D array's tp find the largest and smallest value and returns a 2-element array.



public class ArrayLocator {

    // Largest double
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = new int[2];
        double max = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Largest int
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = new int[2];
        int max = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Smallest double
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = new int[2];
        double min = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Smallest int
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = new int[2];
        int min = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Main method to test
    public static void main(String[] args) {
        int[][] intArr = {
            {3, 5, 9},
            {1, 7, 2}
        };
        double[][] doubleArr = {
            {1.2, 3.5},
            {0.1, -5.7}
        };

        int[] maxInt = locateLargest(intArr);
        int[] minDouble = locateSmallest(doubleArr);

        System.out.println("Largest int at: [" + maxInt[0] + ", " + maxInt[1] + "]");
        System.out.println("Smallest double at: [" + minDouble[0] + ", " + minDouble[1] + "]");
    }
}
