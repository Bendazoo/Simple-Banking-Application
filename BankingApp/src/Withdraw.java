import java.lang.Math;
public class Withdraw extends Account{
    static double money;
    static void withdraw(){

        System.out.println("Enter an amount to withdraw: ");
        money = scanner.nextDouble();
        scanner.nextLine();
        double value = balance - money;

        if(Math.signum(value) == -1){
            System.out.println("You have insufficient funds for withdraw.");
            System.out.println("===========================");

        } else {
            balance = value;
        }
    }

}

