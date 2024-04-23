package DesignPrinciples;

//interface RestaurantEmployee{
//    void washDishes();
//    void cookFood();
//    void serveCustomer();
//}
//
//class waiter implements RestaurantEmployee{
//    @Override
//    public void serveCustomer() {
//        //yes this is  my work
//    }
//
//    @Override
//    public void cookFood() {
//        //this is not my work
//    }
//
//    @Override
//    public void washDishes() {
//        // this is not my work
//    }
//}

interface WaiterInterface{
    void serveCustomer();
    void takeOrder();


}

interface ChefInterface{
    void cookFood();
    void decideMenu();
}


class Waiter implements WaiterInterface{
    @Override
    public void serveCustomer() {
        System.out.println("serving the food customer");
    }

    @Override
    public void takeOrder() {
        System.out.println("take oder form the customer");
    }
}

//Interface segment principle
public class ISP {
    public static void main(String[] args) {
        System.out.println("Interface segment principle");

        Waiter obj = new Waiter();
        obj.takeOrder();
        obj.serveCustomer();
    }
}
