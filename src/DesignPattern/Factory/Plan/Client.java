package DesignPattern.Factory.Plan;

public class Client {
    public static void main(String[] args) {
        Plan basic = PlanFactory.getPlan(5);
        basic.printPlan();
        Plan lite = PlanFactory.getPlan(7);
        lite.printPlan();
        Plan pro = PlanFactory.getPlan(10);
        pro.printPlan();
    }
}
