public class BankSbipgr {
    String name, bankaccount, bankNumber, accounts;
    int amount;
    static int totalamount, count;

    BankSbipgr() {
        count++;
        accounts = "SBI : " + Integer.toString(count);
    }

    public void getBankDetails(String name, String bankaccount, String bankNumber, int amount) {
        this.name = name;
        this.bankaccount = bankaccount;
        this.bankNumber = bankNumber;
        this.amount = amount;
        totalamount += amount;
    }

    public void depositAmount(int depositAmount) {
        if (depositAmount > 0) {
            amount += depositAmount;
            totalamount += depositAmount;
            System.out.println("Amount Deposited = " + depositAmount);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    public void withdrawAmount(int withdrawAmount) {
        if (withdrawAmount <= amount) {
            amount -= withdrawAmount;
            totalamount -= withdrawAmount;
            System.out.println("Amount Withdrawn = " + withdrawAmount);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    public void putdetails() {
        System.out.println("Name = " + name);
        if (bankaccount.equalsIgnoreCase("savings")) {
            System.out.println("Your Bank Account = " + bankaccount);
        } else if (bankaccount.equalsIgnoreCase("current")) {
            System.out.println("Your Bank Account = " + bankaccount);
        } else {
            System.out.println("Please Enter (Current) or (Savings).");
        }
        System.out.println("Bank Number = " + bankNumber);
        System.out.println("Balance Amount = " + amount);
        System.out.println("SBI Bank Account ID Created = " + accounts);
    }

    public static void totalamounts() {
        System.out.println("Total Amount in Bank = " + totalamount);
        System.out.println("No of Accounts Created = " + count);
    }

    public static void main(String[] args) {
        BankSbipgr bank = new BankSbipgr();
        BankSbipgr bank1 = new BankSbipgr();

        bank.getBankDetails("Hima Sekhar", "Savings", "45616316546", 500);
        bank.putdetails();
        bank.depositAmount(200); // Example deposit
        bank.withdrawAmount(100); // Example withdrawal
        bank.putdetails();
        totalamounts();

        System.out.println("*************************************");

        bank1.getBankDetails("Roman Reigns", "Current", "2457846416", 1000);
        bank1.putdetails();
        bank1.depositAmount(300); // Example deposit
        bank1.withdrawAmount(500); // Example withdrawal
        bank1.putdetails();
        System.out.println("**************************************");
        totalamounts();
    }
}

