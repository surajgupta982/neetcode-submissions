class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();

        int i=0;
        int n = s.length();

        while(i<n)
        {
            char c = s.charAt(i);
            if(c=='(' || c=='{' || c=='[')
                st.push(c);
            else
            {
                if(st.isEmpty())
                    return false;
                if( ( c==')' && st.peek()=='(' ) ||
                    ( c=='}' && st.peek()=='{' ) ||
                    ( c==']' && st.peek()=='[' ) 
                  )
                    st.pop();
                else
                    return false;
            }
            i++;
        }

        if(st.empty())
            return true;
        else
            return false;

    }
}
