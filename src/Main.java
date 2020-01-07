public class Main {


    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(10,15);
        ComplexNumber number2 = new ComplexNumber(10,15);
        ComplexNumber number3 = new ComplexNumber(2,15);
        System.out.println("number1 = number2 " + number2.hashCode());
        System.out.println("number1 = number2 " + number1.hashCode());
        System.out.println("number1 = number2 " + number3.hashCode());
    }
}
