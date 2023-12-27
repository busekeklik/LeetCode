class Solution {
    public String reverseWords(String s) {
        int l = 0;
        int r = 0;
        char a[]=s.toCharArray();
        while(l < s.length()){
            while(r < s.length() && a[r]!=' '){    
                r++;
            }
            reverse(a,l,r-1);             
            l=r+1;
            r=l;
        }
        return String.valueOf(a);
    }
     public String reverse(char s[],int l,int r){
         while(l < r){
             char temp=s[l];
             s[l]=s[r];
             s[r]=temp;
             l++;
             r--;
         }
         return String.valueOf(s);
     }
}