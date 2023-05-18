public class Calculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return firstNumber;
    }

    public double getSecondNumber(){
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }

    public double getDivisionResult () {

        if (secondNumber == 0) {

            return this.secondNumber = 0;

        } else {

            return firstNumber / secondNumber;

        }
    }

    public static void main(String[] args) {
        Calculator count =new Calculator();
        count.setFirstNumber(5.0);
        count.setSecondNumber(4);
        System.out.println("add= " + count.getAdditionResult());
        System.out.println("subtract= " +count.getSubtractionResult());
        count.setFirstNumber(5.25);
            count.setSecondNumber(0);
            System.out.println("multiply= " +count.getMultiplicationResult());
            System.out.println("divide= " +count.getDivisionResult());


        }
}

