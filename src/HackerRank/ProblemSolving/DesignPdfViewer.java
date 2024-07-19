package HackerRank.ProblemSolving;

import java.util.Scanner;

public class DesignPdfViewer {
    public static int designerPdfViewer(int[] h, String word){
        int maxHeight =0;
        for (char c: word.toCharArray()){
            int index = c-'a';
            maxHeight = Math.max(h[index], maxHeight);
        }
        int area = maxHeight * word.length();
        return area;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] h = new int[26];

        for (int i = 0; i < h.length; i++) {
            h[i] = scanner.nextInt();
        }
        scanner.nextLine(); // consume new line
        String word = scanner.next();

        int ans =  designerPdfViewer(h, word);
        System.out.println(ans);
    }
}
