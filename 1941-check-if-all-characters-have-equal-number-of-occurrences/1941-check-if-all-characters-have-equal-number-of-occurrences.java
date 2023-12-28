class Solution {
    public boolean areOccurrencesEqual(String s) {
       
       char[] s1 = s.toCharArray();
       int temp = 0;
        int n = s1.length;
        for (int i = 0; i < n; i++)
        {
            int count = 0;
            for(int j = 0; j < n; j++)
            {
                if(s1[i] == s1[j]) 
                    count++;
            }
            if (i == 0)
                temp = count;
            if (temp != count)
                return false;
        }
        return true;
    }
}