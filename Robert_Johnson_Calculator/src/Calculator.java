public class Calculator {
    private double operandOne;
    private double operandTwo;
    private double operationResult;
    private String operator;

    // Getters

    public double getOperandOne() {
        return this.operandOne;
    }

    public double getOperandTwo() {
        return this.operandTwo;
    }

    public String getOperator() {
        return this.operator;
    }

    public void getResults() {
        System.out.println(performOperation());
    }

    // Setters

    public void setOperandOne(double num) {
        this.operandOne = num;
    }

    public void setOperandTwo(double num) {
        this.operandTwo = num;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    private double performOperation() {
        if (this.operator.equals("+")) {
            this.operationResult = this.operandOne + this.operandTwo;
        } else if (this.operator.equals("-")) {
            this.operationResult = this.operandOne - this.operandTwo;
        }
        return this.operationResult;
    }
}