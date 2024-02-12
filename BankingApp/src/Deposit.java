public class Deposit extends Account{
    static double money;
    static void deposit(){
        System.out.println("Enter an amount to deposit: ");
        money = scanner.nextDouble();
        scanner.nextLine();
        balance += money;

    }
}
