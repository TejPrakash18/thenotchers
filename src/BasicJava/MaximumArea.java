package BasicJava;

import java.util.*;

public class MaximumArea {

    public static int calculateMaximumArea(List<int[]> lines) {

        int maxArea = lines.size();

        return maxArea;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of line segments:");
        int n = scanner.nextInt();
        List<int[]> lines = new ArrayList<>();

        System.out.println("Enter the line segments (x1 y1 x2 y2 for each line):");
        for (int i = 0; i < n; i++) {
            int[] line = new int[4];
            for (int j = 0; j < 4; j++) {
                line[j] = scanner.nextInt();
            }
            lines.add(line);
        }

        int maxArea = calculateMaximumArea(lines);
        System.out.println("Maximum Enclosed Area: " + maxArea);
    }
}
