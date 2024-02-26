package DataStructure.Arrays;

import java.util.Arrays;

public class FindMultipleMissingValues {
    public static void findMissingValues(int[] array) {
        Arrays.sort(array); // Sort the array

        int missingCount = 0; // Track the number of missing values found

        for (int i = 0; i < array.length - 1 && missingCount < 2; i++) {
            if (array[i + 1] - array[i] > 1) { // If a gap is found
                int missingValue = array[i] + 1; // Calculate the missing value
                System.out.println("Missing value: " + missingValue);
                missingCount++; // Increment the count of missing values found
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6}; // Example array with two missing values
        System.out.println("Original Array: " + Arrays.toString(array));
        findMissingValues(array);
    }
}
