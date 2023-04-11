import java.util.*;

public class ArrayNumberChecker {
    public static void main(String[] args) {
        ArrayList<String> string = new ArrayList<>();
      string.add("aa");
      string.add("1a");
      string.add("b");
        System.out.println(checkForNumbers(string));
    }

    /*
    Create a function that takes an array of strings and returns an array with only the strings that have numbers in them. If there are no strings containing numbers, return an empty array.

Examples
numInStr(["1a", "a", "2b", "b"]) ➞ ["1a", "2b"]

numInStr(["abc", "abc10"]) ➞ ["abc10"]

numInStr(["abc", "ab10c", "a10bc", "bcd"]) ➞ ["ab10c", "a10bc"]

numInStr(["this is a test", "test1"]) ➞ ["test1"]
Notes
The strings can contain white spaces or any type of characters.
Bonus: Try solving this
     */
    public static ArrayList<String> checkForNumbers(ArrayList<String> str) {
        ArrayList<String> strings = new ArrayList<>();
        for(String s : str){
            for(int i = 0; i < s.length(); ++i){
               if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                   strings.add(s);
                   break;
               }
            }
        }
        return strings;
    }
}
