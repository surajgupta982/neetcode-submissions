class Solution {
    public int lengthOfLongestSubstring(String s) {
        

        int n = s.length();
        int res = 0;
        for(int i=0;i<n;i++)
        {
            Set<Character> c = new HashSet<>();
            c.add(s.charAt(i));
            int count = 1;
            int j=i;

            while(++j<n)
            {
                //j++;
                if(!c.contains(s.charAt(j)))
                {
                    count++;
                    c.add(s.charAt(j));
                }
                else
                    break;
            }

            res = Math.max(res, count);
        }

        return res;

    }
}
