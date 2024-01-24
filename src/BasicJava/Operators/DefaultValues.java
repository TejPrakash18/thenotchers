package BasicJava.Operators;
class PrintDefaultValues{
    int num; //without static keyword
    void printValue(){
        System.out.println("Default value: "+num);
    }
}
public class DefaultValues {
    static int val; // hame static is liye banana pdta hai ye
    // kyuki main methode hmra static hota hai, static methode
    // only static variable or static function cll krta hai.
    public static void main(String[] args) { // main methode is static so call
                                             // only static variable or methode.
        // size of datatype
        int sizeOfInt = Integer.BYTES;
        System.out.println("Size of int: " + sizeOfInt + " bytes");
        System.out.println("Default value with static keyword: "+ val);
        //create object Printdefault
        PrintDefaultValues obj = new PrintDefaultValues();
        obj.printValue(); // call the function printValue
    }

}
