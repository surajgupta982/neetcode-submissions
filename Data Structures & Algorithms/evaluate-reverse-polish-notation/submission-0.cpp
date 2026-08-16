class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        if(tokens.size()==1)
            return stoi(tokens[0]);
        stack<int> a;
   //     int result;
   //     bool temp=false;
        for(int i=0;i<tokens.size();i++)
        {
           // cout<<result<<"\n";
            if(tokens[i]=="+")
            {   
                int p = a.top();
                a.pop();
                int k = a.top();
                a.pop();
                a.push(k+p);
            }
            else if(tokens[i]=="-")
            {   
                int p = a.top();
                a.pop();
                int k = a.top();
                a.pop();
                a.push(k-p);
            }
            else if(tokens[i]=="*")
            {   
                int p = a.top();
                a.pop();
                int k = a.top();
                a.pop();
                a.push(k*p);
            }
            else if(tokens[i]=="/")
            {   
                int p = a.top();
                a.pop();
                int k = a.top();
                a.pop();
                a.push(k/p);
            }
            else
                a.push(stoi(tokens[i]));
        }

      return a.top();;

    }
};
