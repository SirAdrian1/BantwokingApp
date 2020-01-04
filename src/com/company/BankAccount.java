import java.util.Scanner;
public class BankAccount {

    public BankAccount(String rva, String ro0001) {

    }

    public static void main(String[] args) {
        // TODO  Auto generator method stub

        BankAccount obj1 = new BankAccount("RVA", "RO0001");


    }
}

class BankAccount
{

    int balance;
    int previousTransactions;
    String customerName;
    String customerId;


    BankAccount(String cname,String cid)
    {
        customerName = cname;
        customerId = cid;
    }



     deposit(int amount)
    {
        if(amount !=0)
        {
            int balace = balace + amount;
        }
    }

     witdraw(int amount)
    {
        if (amount !=0)
        {
            balance = balance - amount;
            previousTransactions = -amount;

        }
    }
    void getPreviousTransactions()
    {
        if (previousTransactions > 0)
            System.out.println("Deposited: "+previousTransactions);
    }

    /**
     * @param previousTransactions
     */
    public void setPreviousTransactions(int previousTransactions) {
        this.previousTransactions = previousTransactions;
    }
     if(previosTransaction < 0),
}
    System.out.println("Withdraw: "+Math.abs(previosTransaction));
            }
            else
            {
            System.out.println("No transaction occured");
            }
            }
            void
            {
            char option='/0';
            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome "+customerName);
            System.out.println("Your ID is" + customerId);
            System.out.println("/n");
            System.out.println("A. Check Balace");
            System.out.println("B. Deposit");
            System.out.println("C. Withdraw");
            System.out.println("D. Previos transaction");
            System.out.println("E. Exit");

            do
            {
                System.out.println("-----------------------------------------")
                System.out.println("Enter an option");
                System.out.println("=========================================")
            option = scaner.next().charAt(0);
                System.out.println("/n");

                switch(option)
            {

                case 'A':
                    System.out.println("-------------");
                    System.out.println("Balace = "+balace);
                    System.out.println("--------------");
                    System.out.println("/n");

                    case 'B':
            System.out.println("-------------");
            System.out.println("Enter an amount to deposit);
            System.out.println("--------------");
            System.out.println("/n");
            int amount = scanner.nextInt();
            deposit(amount);
            System.out.println("/n");
            break;


            case 'C':
            System.out.println("-------------");
            System.out.println("Enter an amount to withdraw:" );
            System.out.println("--------------");
            int amount2 = scanner.nextInt();
            deposit(amount2);
            System.out.println("/n");
            break;



            case 'E':
                System.out.println("*********************");
                break;



{














