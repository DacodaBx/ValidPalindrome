

class ValidPalindrome {
    public static void main(String[] args){
        String s = "DacodaBlak";        
        String j = "racecar";
        String b = "The Bronx";
        String i = "Madam";

        System.out.println((isPalindrome(s)));
        System.out.println((isPalindrome(j)));
        System.out.println((isPalindrome(b)));
        System.out.println((isPalindrome(i)));
        

    }
    public static boolean isPalindrome(String s) {
       if(s.length()== 0) return true;
       String palindrome = "";

       for(int i = 0; i < s.length(); i++){
        if(Character.isLetterOrDigit(s.charAt(i))) palindrome += s.charAt(i);
       }
       palindrome = palindrome.toLowerCase();
       int start = 0, end = palindrome.length()-1;
       while(start < end){
           if(palindrome.charAt(start) != palindrome.charAt(end)) return false;
           end--;
           start++;
       }

    return true;

    }
}