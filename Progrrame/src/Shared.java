/*Shared Digit
        Write a method named hasSharedDigit with two parameters of type int.
        Each numbershould be within the range of 10 (inclusive) - 99 (inclusive). If one ofthe numbers is not
        within the range, the method should return false.
        The method should return true if there is a digit that appears in both numbers,such as 2 in 12 and 23;
        otherwise, the method should return false.*/
        public class Shared {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
    }

    public static boolean hasSharedDigit(int sNumber, int pNumber) {
        if (sNumber >= 10 && sNumber <= 99 && pNumber >= 10 && pNumber <= 99 || sNumber / 10 == pNumber / 10) {
            return true;
        }

        return false;
    }
}





