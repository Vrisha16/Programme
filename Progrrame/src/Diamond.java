//Write a program in Java to display the pattern like a diamond.  While loop
        public class Diamond {
    public static void main(String[] args) {// Main Method
        int j = 7;//Declaire variable
        int m = 1;//Declaire variable
        int n;// Colum Printing.
        while (m <= j) { //while loop
            n = 1;
            while (n++ <= j - m) {
                System.out.print("");
            }
            n = 1;
            while (n++ <= m * 2 - 1){
                System.out.print("*");
        }
                System.out.println();
                m++;
            }
            m = j - 1;
            while (m > 0) {
                n = 1;

                while (n++<=j-m) {
                    System.out.print("");}//Ending line after each row
                  while(n++<=m*2-1) {
                      System.out.print("*");
                      System.out.println();
                    m--;
                }
            }
        }
    }




