package quizPro;

public class ComplexDemo {
    public static void main(String[] args) {
        Complex num1 = new Complex(3.0, 4.0);
        Complex num2 = new Complex(1.0, 2.0);

        Complex sum = num1.add(num2);
        Complex difference = num1.subtract(num2);
        Complex product = num1.multiply(num2);
        Complex quotient = num1.divide(num2);

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
