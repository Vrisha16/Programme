import java.util.Scanner;

/* Write a program in Java to display the pattern like a triangle with a number.
        For eg.
        Input number of rows: 10*/
    public class Triangle {
    public static void main(String[] args) {
        {
         int s,n,p;
            System.out.println("input numbers in raw");
            Scanner sp=new Scanner(System.in);
            p=sp.nextInt();
            for (s=1;s<=p;s++)
            {
            for (n=1;n<=s;n++)
                System.out.print(n);
                System.out.println("");

            }
        }
    }
}
