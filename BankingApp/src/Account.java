import java.util.Scanner;

public class Account {
    Scanner scanner = new Scanner(System.in);
    static float balance = 0.00f;

    Account(){

        boolean exit = true;
        String option;

        do {
            System.out.println("A: Checking");
            System.out.println("B: Deposit");
            System.out.println("C: Withdraw");
            System.out.println("D: Previous Transaction");
            System.out.println("E: Exit");
            String[] options = {"A","B","C","D","E"};
            option = scanner.nextLine();

            while(!(option.contains("A") || option.contains("B")||option.contains("C")||option.contains("D")||option.contains("E"))) {
                System.out.println("Type a valid option: ");
                option = scanner.nextLine();
            }

            switch(option){
                case("A"): Checking.balance();
                    break;
                case("B"):
                    break;
                case("C"):
                    break;
                case("D"):
                    break;
                case("E"): exit = false; System.out.println("Have a great day!");
                    break;
            }

        }while(exit == true);
    }
}
