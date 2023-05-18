import java.util.Scanner;

// Display right angle triangle of @ using nested for loops.
public class Angle {
    public static void main(String[] args) {// Main method
        int s, p, rows;
        Scanner sp = new Scanner(System.in);// Scanner class
        System.out.println("Enter the number of rows");
        rows = sp.nextInt();
        for (s = 1; s <= rows; s++)//nested for loops
        {
            for(p=1;p<=s;p++) {
                System.out.println("@");
            }
            System.out.println("");

            }

        }
    }


