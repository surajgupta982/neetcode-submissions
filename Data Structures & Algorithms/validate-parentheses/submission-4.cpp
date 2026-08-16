class Solution {
public:
    bool isValid(string s) {
        stack<char> k;
       
        for(int i=0;i<s.size();i++)
        {
            if(k.empty()){
                k.push(s[i]);
            }
            else if (
                k.top() == '{' && s[i] == '}'
                            || 
                k.top() == '[' && s[i] == ']'
                            ||
                k.top() == '(' && s[i] == ')'
            ){    
                k.pop(); 
            }
            else{
                k.push(s[i]);  
            }  
        }

        if(k.empty())
            return true;
        else
            return false;

    }
};
