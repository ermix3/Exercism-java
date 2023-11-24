class ReverseString {

    String reverse(String inputString) {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
//        StringBuilder sb = new StringBuilder(inputString);
//        return sb.reverse().toString();
        StringBuilder sb = new StringBuilder();
        for(char c : inputString.toCharArray()){
            sb.insert(0, c);
        }
        return sb.toString();
    }
  
}
