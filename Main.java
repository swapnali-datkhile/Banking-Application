package SwapnaliLearnsJava.com;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Indian National Bank");

        bank.addBranch("Pune");

        bank.addCustomer("Pune","Sima", 1000.60);
        bank.addCustomer("Pune", "Riya", 500.45);
        bank.addCustomer("Pune", "Ramesh", 700.50);

        bank.addBranch("Mumbai");
        bank.addCustomer("Mumbai","Rakesh", 1250.70);

        bank.addCustomerTransaction("Pune", "Riya", 400.00);
        bank.addCustomerTransaction("Pune", "Riya", 100.99);
        bank.addCustomerTransaction("Pune", "Ramesh", 900.36);
        bank.addCustomerTransaction("Mumbai","Rakesh", 480.80);

        bank.listCustomers("Pune",false);
        bank.listCustomers("Mumbai", true);





    }
}

