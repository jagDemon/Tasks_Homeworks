import java.util.Scanner;

public class SumOfDigits {

    public static int quersumme(){


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number;");
        int num = input.nextInt();

        int sum = 0;
        while (0 != num){
            sum = sum + (num % 10);
            num = num / 10;
        }

        return sum;

    }
}

/*Question-1 Sum of Digits
Given a number, write a method that finds the sum of its digits.*/
