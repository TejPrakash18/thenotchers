package HackerRank.ObjectsOrientedProgrammingSolution;

import java.util.ArrayList;
import java.util.Scanner;

class Student{ }
class Rockstar{ }
class Hacker{ }

 class InstanceOFTutorial {
    int a = 0, b = 0, c = 0;

    static String count(ArrayList mylist) {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < mylist.size(); i++) {
            Object element = mylist.get(i);
            if (element instanceof Student)
                a++;
            if (element instanceof Rockstar)
                b++;
            if (element instanceof Hacker)
                c++;
        }
        String res = a + " " + b + " " + c;
        return res;
    }
}
    public class JavaInstancezof {
        public static void main(String[] args) {
            ArrayList mylist = new ArrayList();

            Scanner input = new Scanner(System.in);
            int t = input.nextInt();
            for (int i = 0; i <= t; i++) {
                String s = input.nextLine();
                if (s.equals("Student")) mylist.add(new Student());
                if (s.equals("Rockstar")) mylist.add(new Rockstar());
                if (s.equals("Hacker")) mylist.add(new Hacker());
            }
            System.out.println(InstanceOFTutorial.count(mylist));
        }
    }
