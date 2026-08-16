class Solution {
public:
    int trap(vector<int>& height) {
            
    int res = 0;
// ---------------- Optmized O(n) time and O(n) space solution
    int n=height.size();
    vector<int> left;
    left.push_back(height[0]);
    for(int i=1;i<height.size();i++)
    {
        int k =  max(height[i], left[i-1]);
        left.push_back(k);
    }
    
    //if we dont want to use push_back or push_back cant be use because element needs to be inserted at end then define size upfront
    vector<int> right(n);
    right[n-1] = height[n-1];  
    
    for(int i=n-2;i>=0;i--)
    {
        right[i] = max(height[i], right[i+1]);
    }
    
    for(int i=1;i<n-1;i++)
    {
        int k = min(left[i], right[i])-height[i];
        if(k>0);
            res+=k;
    }
    




// ----------------------- Brute force Method having O(n^2) solution ----------------------
//     // For every element of the array
//     for (int i = 1; i < height.size() - 1; i++) {

//         // Find the maximum element on its left
//         int left = height[i];
//         for (int j = 0; j < i; j++)
//             left = max(left, height[j]);

//         // Find the maximum element on its right
//         int right = height[i];
//         for (int j = i + 1; j < height.size(); j++)
//             right = max(right, height[j]);

//         // Update the maximum water
//         int k = min(left, right) - height[i];
//         cout<<k<<" ";
//         res = res + (min(left, right) - height[i]);
//         //cout<<res<<"\n";
//     }
//     //cout<<"\n"<<"\n";

    return res;

    }
};
