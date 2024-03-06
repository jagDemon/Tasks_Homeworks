import java.util.Scanner;

public class RecursiveSumOfDigits {

    public static int recursive(int num){

        int sum = 0;

        while (num != 0){

            sum = sum + (num % 10);
            num = num /10;
        }

        if (sum >= 10){
            return recursive(sum);
        }
        else{
            return sum;
        }

    }

}


/*
Question-2 Sum of Digits Until Producing Single Digit

Digital root is the recursive sum of all the digits in a number.
Given n, write a method that returns the sum of the digits of n. If that value has more than one digit,
continue reducing in this way until a single-digit number is produced. The input will be a non-negative
integer.
Examples
16 --> 1 + 6 = 7
942 --> 9 + 4 + 2 = 15 --> 1 + 5 = 6
132189 --> 1 + 3 + 2 + 1 + 8 + 9 = 24 --> 2 + 4 = 6
493193 --> 4 + 9 + 3 + 1 + 9 + 3 = 29 --> 2 + 9 = 11 --> 1 + 1 = 2
etc...
*/
