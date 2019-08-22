class Solution {
    public boolean isPalindrome(int x) {
        
        String intToString = Integer.toString(x);
        System.out.println("String intToString is : "+intToString);
        String reverse = "";
        
        for(int i = intToString.length() - 1; i>=0; i--)
        {
           reverse += intToString.charAt(i);
        }
        
        System.out.println("Reversed String is "+reverse);
        
        if(intToString.equals(reverse))
            return true;
        else
            return false;
    }
}