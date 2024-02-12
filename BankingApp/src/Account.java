import java.util.Scanner;

public class Account {
    static Scanner scanner = new Scanner(System.in);
    static double balance = 0.00f;
    static String transaction;


    Account(){

        boolean exit = true;
        String option = null;

        do {
            System.out.println("A: Checking");
            System.out.println("B: Deposit");
            System.out.println("C: Withdraw");
            System.out.println("D: Previous Transaction");
            System.out.println("E: Exit");
            option = scanner.nextLine();


            while(!(option.contains("A") || option.contains("B")||option.contains("C")||option.contains("D")||option.contains("E"))) {
                System.out.println("Type a valid option: ");
                option = scanner.nextLine();
            }

            switch(option){
                case("A"): Checking.balance();
                    break;
                case("B"):Deposit.deposit(); transaction = "deposit";
                    break;
                case("C"):Withdraw.withdraw(); transaction = "withdraw";
                    break;
                case("D"):
                    if(transaction == "deposit"){
                        System.out.printf("Deposited: %.2f\n", Deposit.money);
                    } else if(transaction == "withdraw"){
                        System.out.printf("Withdrawn: %.2f \n", Withdraw.money);
                    }
                    System.out.println("===========================");
                    break;
                case("E"): exit = false; System.out.println("Have a great day!");
                    break;
            }



        }while(exit == true);
    }
}
