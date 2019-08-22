class Solution {
    public int strStr(String haystack, String needle) {
        
        
      if(needle == null || haystack == null)
          return -1;
        else
            return haystack.indexOf(needle);
                

    }
}