public class Driver {
  public static void main(String[] args) {
    char[] letters = new char[5];
    for(char c = 'a'; c < letters.length; c++) {
      letters[c - 'a'] = c;
    }
    //Recursion.printAllWords(6);
    Recursion.printNoDoubleLetterWords(4, letters);
  }
}