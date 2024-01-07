package DesignPattern.Proxy;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello proxy user");

        Subject proxy = new Proxy();
        proxy.performAction();
    }
}
