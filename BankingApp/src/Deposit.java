public class Deposit extends Account{

    static void deposit(){
        double money;
        System.out.println("Enter an amount to deposit: ");
        money = scanner.nextDouble();
        scanner.nextLine();
        balance += money;

    }
}
