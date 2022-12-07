import java.security.Principal;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!")
        int age = 24;
        float bet = 12.90F;
        String firstName = "Ahmad Akorede";
        char name = 'A';
        // Concatinating string is with + sign
        String names = "Ahmad" + " Akorede";
//        names.toLowerCase(); to print lower case
//        names.toUpperCase(); to print all character in Upper case
//        names.endsWith(); to check if the string ends with a particular
//        names.length(); to check the length of the characters in string
//        names.replace("A", "B"), is used to replace a character with another character
//        names.trim(); this is used to remove white spaces in the string
//        Escaping sequence with \ and \n
        System.out.println(names.replace("A", "B"));

//        Arithmetic expression
//        (+, *, -, /)
//            Increment operators
            int x = 1;
            x *= 2;
//            System.out.println(x);

//            Order of Operation
//        () Parenthesis
//        */ Multiplication and division
//        +- Addition and subtration
        int a = 12;
        int b = 10;
        int c = 20;
//        System.out.println(a + b / c);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name ");
//        String noun = scanner.nextLine().trim();
//        System.out.println("You are " + noun);


//        Mortgage Calculator
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Principal = ");
//        NumberFormat principal = NumberFormat.getCurrencyInstance();
//        scanner.nextLine().trim();
//        System.out.print("Monthly Interest Rate = ");
//        scanner.nextLine().trim();
//        System.out.print("Number of Payment = ");
//        scanner.nextLine().trim();
//        System.out.print("Mortgage = ");
//        scanner.nextLine().trim();

        int p = 100000;
        double r = 0.2;
        int n = 180;
        double topadd = 1+r;
        double top = (Math.pow(topadd, n));
        double top2 = r*top;

        double down = top - 1;

        double div = Math.ceil(top2/down);
        System.out.println(div);
    }
}