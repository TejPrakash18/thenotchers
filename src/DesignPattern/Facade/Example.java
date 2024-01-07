package DesignPattern.Facade;



// Subsystem classes
class MobileStore {
    public void orderMobile(String mobileModel) {
        System.out.println("Order placed for " + mobileModel);
    }
}

class Inventory {
    public boolean checkStock(String mobileModel) {
        // Simulate checking stock
        return mobileModel.equals("iPhone X") || mobileModel.equals("Samsung Galaxy");
    }
}

class BillingSystem {
    public void billCustomer(String mobileModel) {
        System.out.println("Billing for " + mobileModel + " completed");
    }
}

// Facade class
class ShopFacade {
    private MobileStore mobileStore;
    private Inventory inventory;
    private BillingSystem billingSystem;

    public ShopFacade() {
        this.mobileStore = new MobileStore();
        this.inventory = new Inventory();
        this.billingSystem = new BillingSystem();
    }

    public void purchaseMobile(String mobileModel) {
        if (inventory.checkStock(mobileModel)) {
            mobileStore.orderMobile(mobileModel);
            billingSystem.billCustomer(mobileModel);
        } else {
            System.out.println("Sorry, " + mobileModel + " is out of stock");
        }
    }
}

// Client code
public class Example {
    public static void main(String[] args) {
        ShopFacade shopFacade = new ShopFacade();

        // Shopkeeper using the facade to interact with the subsystems
        shopFacade.purchaseMobile("iPhone X");
        shopFacade.purchaseMobile("OnePlus 9");
    }
}

