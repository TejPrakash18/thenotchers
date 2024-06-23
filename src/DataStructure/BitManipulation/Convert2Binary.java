package DataStructure.BitManipulation;


public class Convert2Binary {
    public static String binary(int number){
        StringBuilder res= new StringBuilder();
        while(number!=0){
            if(number%2 == 1){
                res.append('1');
            }
            else{
                res.append('0');
            }
            number= number/2;
            res.reverse();
        }
        return res.toString();
    }
    public static void main(String[] args) {
        int number = 7;
        String result = binary(number);
        System.out.println(result);
    }
}
