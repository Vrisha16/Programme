/* First And Last Digit Sum
        Write a method named sumFirstAndLastDigit with one parameter of type int called number.
        The method needsto find the first and the last digit of the parameter number passed to the method,
        using a loop and return the sum of the first and the last digit of that number.
        If the number is negative then the method needsto return -1 to indicate an invalid value.*/
        public class Q7{
        public static void main(String[] args) {// Main Method.
                System.out.println(sumFirstAndLastDigit(257));}
             public static int sumFirstAndLastDigit(int number){
                 if (number<0) {
                     return -1;
                 }
                 int lastdigit = number%10;
                 while(number>=10) {
                     number /= 10;
                 }
                 return (number+lastdigit);

                 }
            }





