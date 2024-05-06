class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int res = 0;
        for(char ch : s.toCharArray())
        {
            if(ch=='(')
            st.push('(');
            else if(ch==')')
            {
                int size = st.size();
                res = Math.max(res,size);
                st.pop();
            }
        }
        return res;
    }
}