import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        System.out.print("What is Bitcoin price today?: ");
        Scanner scan = new Scanner(System.in);
        int priceBitcoin = scan.nextInt();
        System.out.println (priceBitcoin);

        System.out.print("How much $ do you have?: ");
        int money = scan.nextInt();
        System.out.println (money);
        double moneyD = money;

        double value = moneyD/priceBitcoin;
        String result = String.format("%.7f",value);
        System.out.print("You can buy " + result + " BTC");
    }





}