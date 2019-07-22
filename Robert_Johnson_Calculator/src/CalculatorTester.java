public class CalculatorTester {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
         calc.setOperandOne(35.1);
         calc.setOperandTwo(22.3);
         calc.setOperator("-");
         calc.getResults();
        System.out.println(calc.getOperandOne());
    }
}