package HackerRank.ObjectsOrientedProgrammingSolution;

class BiCycle{
    String defineMe(){
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle
{
    String defineMe()
    {
        return "a cycle with an engine.";
    }

    MotorCycle()
    {


        System.out.println("Hello I am a motorcycle, I am "+defineMe());
        String temp=super.defineMe();
        System.out.println("My ancestor is a cycle who is "+temp );
    }
}
public class JavaMethodOverrindingII {
    public static void main(String[] args) {
        MotorCycle obj = new MotorCycle();
    }
}
