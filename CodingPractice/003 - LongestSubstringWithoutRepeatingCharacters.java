//https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/

class Solution {
    public int lengthOfLongestSubstring(String s){
        
        int i = 0;
        int j = 0, max = 0;
        Set<Character> hs = new HashSet<Character>();
    
        while (j < s.length())
        {
            if (!hs.contains(s.charAt(j))) 
            {
                System.out.print("Adding - "+s.charAt(j));
                hs.add(s.charAt(j++));
                max = Math.max(max, hs.size());
                System.out.print(" Max = "+max+"\n");         
            } 
            else 
            {
                System.out.println("Removing - "+s.charAt(i));
                hs.remove(s.charAt(i++));                
            }
        }
    
    return max;
    }
}