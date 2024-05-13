package DesignPattern.Factory.Plan;

public class LitePlan implements Plan{
    int planRate = 7;
    @Override
    public void printPlan() {
        System.out.println("LitePlan");
    }
}
