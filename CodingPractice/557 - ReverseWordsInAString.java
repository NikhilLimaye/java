Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.

class ReverseWordsInAString {
    public String reverseWords(String s) {
        
        String str[] = s.split(" ");        
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < str.length ; i++)
        {
            char[] temp = new char[str[i].length()];
            for(int j = 0, k =str[i].length() -1 ; j<str[i].length() && k >=0 ; j++, k-- )
            {
                temp[k] = str[i].charAt(j);          
            }
            result.append(temp);
            if(i != str.length - 1)
                result.append(" ");            
        }
        
        return result.toString();
        
    }
}
