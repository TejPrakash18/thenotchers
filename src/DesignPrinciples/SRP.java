package DesignPrinciples;

class Maker{
    int year;
    int price;
    String color;
    String name;

    public Maker(String color, String name, int year, int price)
    {
        this.color = color;
        this.price = price;
        this.name = name;
        this.year = year;
    }

}

//this class should have more then 1 reason to change 1. if add to the GST change calculate method
// 2reason saveDB na krake saveFile kiya gaye to, 3.
// class Invoice{
//    private  Maker maker;
//    private int quantity;
//
//    public Invoice(Maker maker, int quantity){
//        this.maker = maker;
//        this.quantity = quantity;
//    }
//    public int calculateTotal(){
//        int price = (maker.price)*quantity;
//        return price;
//    }
//    public void printInvoice(){
//
//    }
//    public void saveDB(){
//
//    }
// }


//each class have single responsibility

 class Invoice{
    private  Maker maker;
    private int quantity;

    public Invoice(Maker maker, int quantity){
        this.maker = maker;
        this.quantity = quantity;
    }
    public int calculateTotal(){
        int price = (maker.price)*quantity;
        return price;
    }
 }

 class InvoiceDao{
    Invoice invoice;

    public InvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }
    public void saveToDB(){
        //save into the Database
    }
 }

 class InvoicePrint{
    Invoice invoice;

    public InvoicePrint(Invoice invoice){
        this.invoice = invoice;
    }
    public void printInvoice(){
        // print the invoice
    }
 }




//single responsibility principal
public class SRP {
    public static void main(String[] args) {

        Maker obj = new Maker("blue", "ARTLINE", 2024, 20);
        Invoice invoice = new Invoice(obj, 5);
        int total = invoice.calculateTotal();
        System.out.println(total);

    }
}
