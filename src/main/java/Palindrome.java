import java.util.ArrayList;

public class Palindrome {
  public static void main(String[] args){
  }

  public Boolean isPalindrome(String word) {
    word = word.toUpperCase();
    char[] splitWord = word.toCharArray();
    ArrayList<String> splitWordReverse = new ArrayList<>();
    for(Integer i = splitWord.length - 1; i >= 0; i -= 1){
      splitWordReverse.add(Character.toString(splitWord[i]));
    }
    String joined = String.join("", splitWordReverse);
    if(word.equals(joined)){
      return true;
    } else {
      return false;
    }
  }
}
