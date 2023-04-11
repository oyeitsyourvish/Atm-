import java.util.Scanner;

class Atm {

    static Scanner sc = new Scanner(System.in);
    static Account a = new Account();

    public void withdraw() {
        System.out.println("Enter the UserName number");
        int username = sc.nextInt();
        if (a.getUserName() == username) {
            System.out.println("Enter the Password");
            int pass = sc.nextInt();
            if (a.getPass() == pass) {
                System.out.println("Enter the Amount");
                double amount = sc.nextInt();
                if (amount <= a.getBal()) {
                    double currbal = a.getBal() - amount;
                    a.setBal(currbal);
                    System.out.println("Amount Withdraw Successfully...");
                } else {
                    System.out.println("Insufficiant Balance...");
                }
            } else {
                System.out.println("Password is Incorrect...");
            }
        } else {
            System.out.println("UserName is Incorrect...");
        }

    }

    // ------------------------------------------------------------------------------------------------
    public void deposit() {
        System.out.println("Enter the Account Number");
        int acc = sc.nextInt();
        if (a.getAcc() == acc) {
            System.out.println("Enter the Password");
            int pass = sc.nextInt();
            if (a.getPass() == pass) {
                System.out.println("Enter the Amount");
                double amount = sc.nextInt();
                if (amount > 0) {
                    double currbal = a.getBal() + amount;
                    a.setBal(currbal);
                    System.out.println("Amount Deposited Successfully.....");
                }
            } else {
                System.out.println("Password is Incorrect.....");
            }
        } else {
            System.out.println("Account Number is Incorrect.....");
        }

    }

    // ------------------------------------------------------------------------------------------------
    public void checkBal() {

        System.out.println("Available Balance is :- " + a.getBal());

    }

    // ------------------------------------------------------------------------------------------------
    public void allDetails() {
        System.out.println("Enter the User Name number");
        int username = sc.nextInt();
        if (a.getUserName() == username) {
            System.out.println("Entert the Password");
            int pass = sc.nextInt();
            if (a.getPass() == pass) {
                System.out.println();
                System.out.println();
                System.out.println("@ This is Your Account Profile @");
                System.out.println("Account Holder Name   :- " + a.getName());
                System.out.println("Account Number        :- " + a.getAcc());
                System.out.println("Current Available Bal :- " + a.getBal());
            } else {
                System.out.println("Password is Incorrect.....");
            }

        } else {
            System.out.println("User Name is Incorrect......");
        }

    }

    // ------------------------------------------------------------------------------------------------

}
