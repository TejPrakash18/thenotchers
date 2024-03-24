package BasicJava.ArraysProblem;

public class DupliateValue {
    static void duplicateWithCount(int[] array){
        int count = 0;
        int duplicate = 0;
        for (int i = 0; i < array.length; i++) {
            count=0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]&& i != j){
                   duplicate = array[j];
                    count++;
                }
            }
        }
        System.out.println("Duplicate "+duplicate);
        System.out.println("counts "+count);
    }
    public static void main(String[] args) {
        int[] array = {2,3,4,2,6,7,2};
        duplicateWithCount(array);
    }
}
