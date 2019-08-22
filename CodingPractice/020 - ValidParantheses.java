class Solution extends RuntimeException {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        
        for(int i = 0 ; i < s.length() ; i++)
        {
            char c = s.charAt(i);
            if(c == '(' ||  c =='[' || c == '{')
            {             
                st.push(c);
                continue;
            }
            
            if(st.empty())
                return false;
         
        
            switch(c)
            {
                case ')' : if(st.peek() == '(')
                            st.pop();
                            else
                                return false;
                            break;

                case ']' : if(st.peek() == '[')
                            st.pop();
                            else
                                return false;
                            break;
            
                case '}' : if(st.peek() == '{')
                            st.pop();
                            else
                                return false;
                            break;                      
            }
        }

        if(st.empty())
            return true;
        else
            return false;
    }
}