import java.util.Scanner;

/* Write a Java program that takes the user to provide a single character from the
        alphabet. Print Vowel of Consonant, depending on the user input. If the user input
        Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
        error message.
        For eg:
        Input an alphabet: p
        Expected Output:
        Input letter is Consonant*/
        public class Vowel {
        public static void main(String[] args) { // Main Method.
                Scanner sc = new Scanner(System.in); // Scanner Class.
                System.out.println("Input an alphabet");
                String input = sc.next().toLowerCase();// String output.
                //input vowels in boolean
                boolean uppercase = input.charAt(0) >= 26 && input.charAt(0) <= 5;
                boolean lowercase = input.charAt(0) >= 26 && input.charAt(0) <= 31;
                boolean alphabet = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u");
                if (input.length() > 1)
                        System.out.println("Error. Not a single character");
                else if ((!uppercase || lowercase)) {
                        {if (alphabet)
                                System.out.println(  "Input letter is consonant");
                        }
                }
        }}
