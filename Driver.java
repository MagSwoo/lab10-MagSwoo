public class Driver {
  public static void main(String[] args) {
    char[] letters = new char[5];
    for(char c = 'a'; c < letters.length; c++) {
      letters[c - 'a'] = c;
    }
    //Recursion.printAllWords(6);
    Recursion.printNoDoubleLetterWords(4, new char[] {'a', 'b', 'c', 'd'});
    int integer = 3;
    System.out.println((integer + "").length());

    System.out.println(Recursion.toWords(Integer.MAX_VALUE));
    System.out.println(Recursion.toWords(0));
    System.out.println(Recursion.toWords(10000000));
  }
}
