import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Collections.min;

/* -Read the numbers from the console entered by the user and print the minimum
        and maximum number the user has entered.
        -Before the user entersthe number, print the message Enter number:
        -If the user enters an invalid number, break out of the loop and print the minimum and maximum
        number.
        Hint:
        -Use an endless while loop.
        -Create a class with the name MinAndMaxInputChallenge.*/
        public class MinAndMaxInputChallenge { //Class Name
        public static void main(String[] args) { //Main Method.
                ArrayList<Integer> numbers = new ArrayList<Integer>();
                Scanner sc = new Scanner(System.in);
                while (true) {
                        System.out.println("Enter Numbers");
                        String sp = sc.nextLine();
                        if (sp.equals("")) {
                                break;
                        }
                }
                if (numbers.size() > 0) {
                        int min = min(numbers);
                        int max = Collections.max(numbers);
                        System.out.println("Minimum number" + min);
                        System.out.println("Maximum number" + max);
                } else {
                        System.out.println("Invalid number enter");
                }
        }
}
























