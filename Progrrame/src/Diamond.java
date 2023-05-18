import java.util.Scanner;

//Write a program in Java to display the pattern like a diamond.  While loop
        public class Diamond {
    public static void main(String[] args) {
        hero();
    }
   public static void hero(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of rows:");
        int n = sc.nextInt();

                int i = 1;
                while (1 <= n) {
                    i = 1;
                    while (i++ <= n - i) {
                        i = 1;
                    }
                    while (i++ <= n - i) {
                        System.out.print("");
                    }
                    i = 1;
                    while (i++ <= i * 2 - 1)
                    {
                        i=1;
                        while(i++<=i*2-1)
                        System.out.print("*");
                    }
                    System.out.println();
                    i++;
                }
                i = n - 1;
                while (i > 0) {
                    i = 1;
                    while (i++ <= n - i)
                    {
                        System.out.print("");
                    }
                    i = 1;
                    while (i++ <= i * 2 - 1) {
                        System.out.print("*");
                    }
                    System.out.println();
                    i++;
                }
                i = n - 1;
                while (i++ <= n - i) {
                    System.out.print("");
                }
                i = 1;
                while (i++ <= i * 2 - 1) {
                    System.out.print("*");
                }
       System.out.println();
       i--;

    }
        }


















