package BasicJava.Basic;

public class GrossSalary {
    public static void main(String[] args) {
        int basicSalary =  20000;
        int houseRent = 1500;
        int transport = 1000;
        int providentFund = 2500;
        int incomeTax = 2000;

        int grossSalary = basicSalary + houseRent + transport + providentFund + incomeTax;
        System.out.println("Gross salary " + grossSalary);

    }
}
