package DesignPrinciples;


//open close principal

class Makers{
    int year;
    int price;
    String color;
    String name;

    public Makers(String color, String name, int year, int price)
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

class Invoices{
    private  Maker maker;
    private int quantity;

    public Invoices(Maker maker, int quantity){
        this.maker = maker;
        this.quantity = quantity;
    }
    public int calculateTotal(){
        int price = (maker.price)*quantity;
        return price;
    }
}


// violation of rules open close principal

//class InvoiceDaos{
//    Invoice invoice;
//
//    public InvoiceDaos(Invoice invoice){
//        this.invoice = invoice;
//    }
//    public void saveToDB(){
//        //save into the Database
//    }
//
//    public void saveToFile(String fileName){
//        //save to file
//    }
//}

interface InvoiceDaos{
    public void save(Invoice invoice);
}
class SaveToDB implements InvoiceDaos{
    @Override
    public void save(Invoice invoice) {
        // save to DB
    }
}

class SaveToFile implements InvoiceDaos {
    @Override
    public void save(Invoice invoice) {
        //save to file system
    }
}


class InvoicePrinter{
    Invoice invoice;

    public InvoicePrinter(Invoice invoice){
        this.invoice = invoice;
    }
    public void printInvoice(){
        // print the invoice
    }
}

public class OCP {
    public static void main(String[] args) {

    }
}
