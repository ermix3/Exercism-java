class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        try {
            switch (operation) {
                case "" -> throw new IllegalArgumentException("Operation cannot be empty");
                case null -> throw new IllegalArgumentException("Operation cannot be null");
                case "+" -> {
                    return String.format("%d + %d = %d", operand1, operand2, operand1 + operand2);
                }
                case "*" -> {
                    return String.format("%d * %d = %d", operand1, operand2, operand1 * operand2);
                }
                case "/" -> {
                    return String.format("%d / %d = %d", operand1, operand2, operand1 / operand2);
                }
                default ->
                        throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
            }
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
    }
}
