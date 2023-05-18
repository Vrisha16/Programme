//Write a programme to input any number and check if it is prime or not.
public class Prime {
    public static void main(String[] args) {
        int num = 19;
        boolean sum=false;
        for(int i=2; i <=num/2;++i){
            if (num%i==0){
                sum=true;
                break;
            }
        }
        if(!sum)
            System.out.println(num+"is a prime number");
        System.out.println(num+"is not a prime number");
    }
}
