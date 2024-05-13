package DesignPattern.Factory.Plan;

public class BasicPlan implements Plan {
    int planRate = 5;
    @Override
    public void printPlan() {
        System.out.println("Basic plan");
    }
}
