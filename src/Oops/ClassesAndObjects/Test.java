package Oops.ClassesAndObjects;

class TestStatic{
    static int age;

    static int setAge(int age){
        age = age;
        return age;
    }

    TestStatic(){
        System.out.println("Heyy..");
    }
}
public class Test {
    public static void main(String[] args) {
        new TestStatic();
        System.out.println(TestStatic.setAge(12));
    }
}
