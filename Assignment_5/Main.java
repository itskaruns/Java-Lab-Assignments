import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        try {
            ArrayList<Customer> customers = new ArrayList<>();
            
            Customer c1 = new Customer(
                    "080",
                    "Karunya",
                    "Agarwal",
                    "karunyagarwal@gmail.com",
                    "8857855056",
                    "Pune",
                    "345325425231",
                    "freg234"
            );
            
            Customer c2 = new Customer(
                    "090",
                    "Khushboo",
                    "Talaviya",
                    "khushboo.talaviya.btech2024@sitpune.edu.in",
                    "8421047783",
                    "Mumbai",
                    "1232432454",
                    "egwegjow1"
            );
            
           
            
            customers.add(c1);
            customers.add(c2);
            
            ArrayList<Account> accounts = new ArrayList<>();
            
            SavingsAccount sa1 = new SavingsAccount(1001, 9000, c1);
            Checkings ca1 = new Checkings(2001, 10000, c1);
            accounts.add(sa1);
            accounts.add(ca1);
            
            SavingsAccount sa2 = new SavingsAccount(1002, 10000, c2);
            Checkings ca2 = new Checkings(2002, 15000, c2);
            accounts.add(sa2);
            accounts.add(ca2);
            
           
            
            System.out.println("\n  Performing Transactions \n");
            sa1.deposit(34000);
            sa1.withdraw(1000);
            sa1.calculateInterest();
            System.out.println();
            Loan loan = new Loan(12000, 23);
            loan.displayLoan();
            loan.payEMI(sa1);
        }
        catch(InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    
    public static void displayInfo(ArrayList<Customer> customers, ArrayList<Account> accounts) {
        
        for(Customer cust : customers) {
            System.out.println("---- CUSTOMER DETAILS ----");
            cust.displayCustomer();
            
            System.out.println("\n---- ACCOUNTS ----");
            double totalBalance = 0;
            int accountCount = 0;
            
            for(Account acc : accounts) {
                if(acc.customer.customerID.equals(cust.customerID)) {
                    System.out.println("Account Number: " + acc.accountNumber);
                    System.out.println("Account Type: " + acc.getClass().getSimpleName());
                    System.out.println("Balance: Rs. " + acc.balance);
                    totalBalance += acc.balance;
                    accountCount++;
                    System.out.println();
                }
            }

            if(accountCount > 0) {
                System.out.println("Total Accounts: " + accountCount);
                System.out.println("Total Balance Across All Accounts: Rs. " + totalBalance);
            } else {
                System.out.println("No accounts found for this customer.");
            }
        }
    }
}