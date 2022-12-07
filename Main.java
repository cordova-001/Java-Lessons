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
            System.out.println(x);

//            Order of Operation
//        () Parenthesis
//        */ Multiplication and division
//        +- Addition and subtration
        int a = 12;
        int b = 10;
        int c = 20;
        System.out.println(a + b / c);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Age ");
        byte ball = scanner.nextByte();
        System.out.println("You are " + ball);


    }
}