public class Palindrome{
    public static boolean is_palindrome(String s)
    {
        int start = 0;
        int end = s.length() - 1;
        while (end > start) {
            if (s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }
}