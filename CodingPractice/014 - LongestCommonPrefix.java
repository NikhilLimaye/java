Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


public String longestCommonPrefix(String[] strs) {
        boolean flag = true;                            
        int pos = 0;
        StringBuilder s = new StringBuilder();
        while(flag)
        {
            char temp = '0';
            Set<Character> myset = new HashSet<Character>();        
            for(int i=0 ; i <strs.length ; i++)
            {
                if(pos == strs[i].length())
                {
                    myset.clear();
                    break; 
                }
                    
                else
                {
                    temp = strs[i].charAt(pos);
                    myset.add(temp);
                }    
                               
            }
            pos++;

            if(myset.size()==1)
            {
                s.append(temp);
                myset.clear();
            }                
            else
                flag = false;                   
       }
        return s.toString();       
    }
