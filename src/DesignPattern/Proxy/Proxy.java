package DesignPattern.Proxy;

public class Proxy implements Subject{
    private RealSubject rs;

    @Override
    public void performAction() {
        if (rs == null){
            rs = new RealSubject();
        }
        System.out.println("Proxy is perform pre-action tasks");
        rs.performAction();
        System.out.println("Proxy is perform post-action tasks");
    }
}
