class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        // throw new UnsupportedOperationException("Delete this statement and write your
        // own implementation.");
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum += i;
        }
        return sum * sum;
    }

    int computeSumOfSquaresTo(int input) {
        // throw new UnsupportedOperationException("Delete this statement and write your
        // own implementation.");
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum += i * i;
        }
        return sum;
    }

    int computeDifferenceOfSquares(int input) {
        // throw new UnsupportedOperationException("Delete this statement and write your
        // own implementation.");
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
