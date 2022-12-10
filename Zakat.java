import java.util.Scanner;

public class Zakat {
    public static void main(String[] args){
        final double RATE = 0.25;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Savings: ");
        int savings = scanner.nextInt();

        System.out.print("Assets: ");
        int assets = scanner.nextInt();

        System.out.print("Cash: ");
        int cash = scanner.nextInt();

        System.out.print("Liabilities: ");
        int liabilities = scanner.nextInt();

        double total = (savings + assets + cash - liabilities)/RATE;

        System.out.println("Zakat = " + (total));
    }
}