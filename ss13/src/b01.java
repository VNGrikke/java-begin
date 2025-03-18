public class b01 {
    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 10;
        int result = calculateExpression(firstNumber, secondNumber);
        System.out.println("ket qua: " + result);
    }

    public static int calculateExpression(int firstNumber, int secondNumber) {
        return (firstNumber * secondNumber) + (firstNumber + secondNumber);
    }
}
