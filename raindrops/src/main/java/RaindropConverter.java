class RaindropConverter {

    String convert(int number) {
        // StringBuilder sb = new StringBuilder();
        // sb.append(number % 3 == 0 ? "Pling" : String.valueOf(number));
        // sb.append(number % 5 == 0 ? "Plang" : String.valueOf(number));
        // sb.append(number % 7 == 0 ? "Plong" : String.valueOf(number));
        // return sb.toString();
        String result = "";
        if (number % 3 == 0) {
            result += "Pling";
        }
        if (number % 5 == 0) {
            result += "Plang";
        }
        if (number % 7 == 0) {
            result += "Plong";
        }
        return result.isEmpty() ? String.valueOf(number) : result;
    }
}
