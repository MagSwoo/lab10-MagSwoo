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
      if(n == 0) {
        return "zero";
      }
      return toWords2(n);
    }
    
    private static String[] ones = new String[] {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static String[] tens = new String[] {"", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    public static String toWords2(int n) {
      int digits = ("" + n).length();
      if(digits > 12) {
        return null;
      } else if(digits > 9) {
        return toWords2(n/1000000000) + " billion " + toWords2(n - 1000000000*(n/1000000000));
      } else if(digits > 6) {
        return toWords2(n/1000000) + " million " + toWords2(n - 1000000*(n/1000000));
      } else if(digits > 3) {
        return toWords2(n/1000) + " thousand " + toWords2(n - 1000*(n/1000));
      } else if(digits > 2) {
        if((n - 100*(n/100))/10 != 0) {
          return ones[n/100] + " hundred and " + toWords2(n - 100*(n/100));
        }
        return ones[n/100] + " hundred " + toWords2(n - 100*(n/100));
      } else if(digits > 1) {
        if(n < 20 && n > 10) {
          return ones[n - 10*(n/10)] + "teen";
        } else {
          if(n - 10*(n/10) == 0) {
            return tens[n/10];
          }
          return tens[n/10] + "-" + ones[n - 10*(n/10)];
        }
      } else {
        return ones[n];
      }
    }
}
