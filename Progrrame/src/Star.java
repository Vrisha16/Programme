//Display left angle triangle of * using nested for loops
public class Star {
    public static void main(String[] args) { // Main Method
        int Rows=5;
        for(int i=1;i<=Rows;i++){ //For loops
            for(int j=1;j<=i;j++){ //Nested for loops
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
