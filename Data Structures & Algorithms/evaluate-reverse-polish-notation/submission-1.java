class Solution {
    public int evalRPN(String[] tokens) {
        
            int n = tokens.length;

            if(n==1)
                return Integer.valueOf(tokens[0]);

            Stack<Integer> st = new Stack<>();
            for(int i=0;i<n;i++)
            {
                if(tokens[i].equals("+"))
                {
                    int p = st.pop();
                    int k = st.pop();
                    st.push(p+k);
                }
                else if(tokens[i].equals("-"))
                {
                    int p = st.pop();
                    int k = st.pop();
                    st.push(k-p);
                }
                else if(tokens[i].equals("*"))
                {
                    int p = st.pop();
                    int k = st.pop();
                    st.push(k*p);
                }
                else if(tokens[i].equals("/"))
                {
                    int p = st.pop();
                    int k = st.pop();
                    st.push(k/p);
                }
                else
                    st.push(Integer.valueOf(tokens[i]));
            }

            return st.peek();

    }
}
