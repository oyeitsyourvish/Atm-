import java.io.OutputStream;

class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Application");
        Atm a = new Atm();

        for (;;) {
            System.out.println("1.Withdraw   2.Deposit   3.Check Bal    4.Account Details    5.Exit");
            switch (a.sc.nextInt()) {
                case 1: {
                    a.withdraw();
                    break;
                }
                case 2: {
                    a.deposit();
                    break;
                }
                case 3: {
                    a.checkBal();
                    break;
                }
                case 4: {
                    a.allDetails();
                    break;
                }
                case 5: {
                    System.out.println("Application Closed...");
                    return;
                }
            }
        }
    }
}
