package DesignPattern.Factory.Plan;

public class ProPlan implements Plan{
    int planRate = 10;
    @Override
    public void printPlan() {
        System.out.println("ProPlan");
    }
}
