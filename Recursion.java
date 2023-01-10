public class Recursion{

   /*Print all words that are made of the letters a-e inclusive.
    *@param length : the length of the words that are to be printed
    */
    public static void printAllWords(int length){
      //do not change this method.
      printAllWords(length,"");
    }

   /*Print all words that are made of the letters a-e inclusive.
    *@param length : either how many more letters or the total length depending on implementation
    *@param word   : the partial word so far.
    */
    public static void printAllWords(int length,String word){
      if(word.length() == length) {
        System.out.println(word);
      } else {
        for(char c = 'a'; c < 'z'; c++) {
          printAllWords(length, word + c);
        }
      }
    }

  /*Print all words that are made of the characters in the array of letters.
    *There may not be consecutive equal letters, so:
    *aax is not allowed, but axa is allowed.
    *@param length : the length of the words that are to be printed
    *@param letters: the letters you should be using
    *@precondition: letters contains at least 2 characters, and has no duplicates.
    */
    public static void printNoDoubleLetterWords(int length,char[] letters){
      //do not change this method
      printNoDoubleLetterWords(length,"",letters);
    }

    /*Print all words that are made of the characters in letters. There may not be consecutive equal letters,
    *aax is not allowed, but axa is allowed.
    *@param length : either how many more letters need to be
    *@param word   : the partial word so far.
    *@param letters: the letters you should be using
    */
    public static void printNoDoubleLetterWords(int length,String word,char[]letters){
      if(word.length() == length) {
        System.out.println(word);
      } else {
        for(int i = 0; i < letters.length; i++) {
          if(word.length() > 0) {
            if(word.charAt(word.length()-1) != letters[i]) {
              printNoDoubleLetterWords(length, word + letters[i], letters);
            }
          } else {
              printNoDoubleLetterWords(length, word + letters[i], letters);
          }
        }
      }
    }

    public static String toWords(int n) {
      int digits = ("" + n).length();
      if(digits > 12) {

      } else if(digits > 9) {

      } else if(digits > 6) {

      } else if(digits > 3) {

      } else if(digits > 2) {

      } else if(digits > 1) {
        if(n < 20) {
          return digit(n - 10*(n/10)) + "teen";
        } else if(n < 30) {
          return "twenty-" + digit(n - 10*(n/10));
        } else if(n < 40) {
          return "thirty-" + digit(n - 10*(n/10));
        } else if(n >= 50 && n < 60) {
          return "fifty-" + digit(n - 10*(n/10));
        } else {
          return digit(n/10) + "ty-" + digit(n - 10*(n/10));
        }
      } else {
        return digit(n);
      }

    }

    public static String digit(int n) {
      if(n == 1) {
        return "one";
      }
      if(n == 2) {
        return "two";
      }
      if(n == 3) {
        return "three";
      }
      if(n == 4) {
        return "four";
      }
      if(n == 5) {
        return "five";
      }
      if(n == 6) {
        return "six";
      }
      if(n == 7) {
        return "seven";
      }
      if(n == 8) {
        return "eight";
      }
      if(n == 9) {
        return "nine";
      }
    }
}
