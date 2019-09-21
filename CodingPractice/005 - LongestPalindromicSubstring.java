class Solution {
    public String longestPalindrome(String s) {
        
        if(s.length() < 2) 
            return s; 
        
        String result = s.substring(0,1);
        int index = 0;
        for(int i = index ; i < s.length() ; i++) {
            char current = s.charAt(index);
            
            int j = i + 1;
            while(j < s.length()) {
                String test = s.substring(i,j+1);
                if(s.charAt(j) == s.charAt(i) && test.length() > result.length() && isPal(test))
                    result = test;
                
                j++;
            }                 
        }
        
        return result;
    }
    
    public boolean isPal(String t) {
        
        String reverse = new StringBuffer(t).reverse().toString(); 
        
        return t.equals(reverse);
    }
}