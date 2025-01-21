import java.util.Scanner;
class Bank
{
    static double intRate;
    String name;
    double deposite;
    static double getBalance(Bank cust)
    {
        double d = cust.deposite;
        return d + d * intRate / 100;
    }
    Bank(String n,double d)
    {
        name = n;
        deposite = d;
    }
}

class Customer
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter interest rate :");
        Bank.intRate = sc.nextInt();

        Bank cust1 = new Bank("Monu",1500);
        Bank cust2 = new Bank("Dmol",1000);

        System.out.println("Details of "+cust1.name);
        System.out.println("\tInterest rate :"+Bank.intRate);
        System.out.println("\tDeposit :"+cust1.deposite);
        System.out.println("\tBalance :"+Bank.getBalance(cust1));

        System.out.println("Details of "+cust2.name);
        System.out.println("\tInterest rate :"+Bank.intRate);
        System.out.println("\tDeposit :"+cust2.deposite);
        System.out.println("\tBalance :"+Bank.getBalance(cust2));
    }
}