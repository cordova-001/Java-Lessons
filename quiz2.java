import java.util.Scanner;

public class quiz2 {
    public static void main(String[] args){

        int check = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number ");
        int number = scanner.nextInt();

        if(number % 3 == 0)
            System.out.print("buzz");
        if(number % 5 == 0)
            System.out.print(" Fizz");
        else if(number % 5 != 0 && number % 3 != 0)
            System.out.print(number);






//        if number is divisible by 5 print fizz
//        if number is divisible by 3 print buzz
//        if number is divisible by 5 and 3 print fizzbuzz

    }
}