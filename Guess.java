import java.util.Scanner;

public class Guess{
    public  static void main(String[] args){
        int min = 10;
        int max = 20;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Guess a number between 10 and 20 ");
        int answer = scanner.nextInt();
        int real_number = (int)Math.floor(Math.random()*(max-min+1)+min);

        if(answer < real_number)
            System.out.println("Your number is less than answer " + real_number);
        else if(answer > real_number)
            System.out.println("Your number is greater than the answer " + real_number);
        else if(answer==real_number)
            System.out.println("You are wonderful");
    }
}