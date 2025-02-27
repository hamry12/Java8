package predefined;

import java.util.function.Function;

public class FunctionImpl implements Function<String, Boolean> {
    @Override
    public Boolean apply(String s) {
        return checkIfPalindrome(s);
    }

    public static boolean checkIfPalindrome(String s) {
        StringBuilder palindrome=new StringBuilder();
        for(int i = s.length()-1; i>=0; i--){
            palindrome.append(s.charAt(i));
        }
        return s.equalsIgnoreCase(palindrome.toString());
    }
}
