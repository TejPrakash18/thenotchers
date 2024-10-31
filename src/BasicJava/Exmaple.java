package BasicJava;

public class Exmaple {
    private int var;
    public Exmaple(int var){
        this.var= var;
    }
    public static void main(String[] args) {
        Exmaple obj = new Exmaple(4);
        System.out.println(obj.var);
        String[] name = new String[3];
        name[0] = "Tej";
        name[1] = "Manish";
        System.out.println(name[2]);
        int arr[] = {120,200,016};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+ " ");
        }
        System.out.println(0647);
        int x=5;
        System.out.println(++x*2);
        }
}
