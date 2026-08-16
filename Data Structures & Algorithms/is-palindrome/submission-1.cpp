class Solution {
public:
    bool isPalindrome(string s) {
        string st;
        for(int i=0;i<s.size();i++)
        {
            char c = s[i];
            if(c>='a'&&c<='z' || c>='A'&&c<'Z' || c>='0'&&c<='9') 
                st.push_back(tolower(s[i]));
        }
        cout<<st<<"\n";
        int i = 0;
        int j = st.size()-1;
        while(i<=j)
        {
            if(st[i]!=st[j])
                return false;
            i++;j--;
        }
        return true;
    }
};
