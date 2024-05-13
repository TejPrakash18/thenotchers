package DesignPattern.Factory.Plan;

import DesignPattern.Factory.Vehicle.Car;

public class PlanFactory {
    public static Plan getPlan(int plan){
        if(5==plan){
            return new BasicPlan();
        }
        else if (7==plan){
            return new LitePlan();
        }
        else if(10==plan) {
            return new ProPlan();
        }
        return null;
    }
}
