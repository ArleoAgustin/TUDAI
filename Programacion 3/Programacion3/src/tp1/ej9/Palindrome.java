package tp1.ej9;

public class Palindrome {


    public Palindrome(){}

    public boolean isPalindrome(String input){
        if (input.length() <= 1)
            return true;
        else if (input.charAt(0) != input.charAt(input.length()-1))
                return false;
        else{
            String subString = input.substring(1, input.length()-1);
            return isPalindrome(subString);
        }
    }
}
