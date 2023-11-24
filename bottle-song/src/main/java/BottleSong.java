class BottleSong {
//
//    String verse(String first, String second) {
//        String bottle = "One".equals(first) ? "bottle" : "bottles";
//        String firstLine = first + " green " + bottle + " hanging on the wall,\n";
//        return firstLine + firstLine +
//                "And if one green bottle should accidentally fall,\n" +
//                "There'll be " + second.toLowerCase() + " green " + ("no".equals(second) ? "bottles" : "One".equals(second) ? "bottle" : "bottles") + " hanging on the wall.";
//    }
//
//    String recite(int startBottles, int takeDown) {
//        String[] numbers = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
//        StringBuilder result = new StringBuilder();
//        for (int i = startBottles; i > (startBottles - takeDown); i--) {
//            result.append(verse(numbers[i - 1], i - 2 >= 0 ? numbers[i - 2] : "no"));
//            result.append("\n");
//            if (i != (startBottles - takeDown + 1)) {
//                result.append("\n");
//            }
//        }
//        return result.toString();
//    }


    String verse(int number) {
        String[] numbers = {"no", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        String bottle = number == 1 ? "bottle" : "bottles";
        String firstLine = numbers[number] + " green " + bottle + " hanging on the wall,\n";
        String secondLine = "And if one green bottle should accidentally fall,\n";
        String thirdLine = "There'll be " + (number - 1 > 0 ? numbers[number - 1].toLowerCase() : "no") + " green " + (number - 1 == 1 ? "bottle" : "bottles") + " hanging on the wall.\n";
        return firstLine + firstLine + secondLine + thirdLine;
    }

    String recite(int startBottles, int takeDown) {
        StringBuilder result = new StringBuilder();
        for (int i = startBottles; i > (startBottles - takeDown); i--) {
            result.append(verse(i));
            if (i != (startBottles - takeDown + 1)) {
                result.append("\n");
            }
        }
        return result.toString();
    }

}