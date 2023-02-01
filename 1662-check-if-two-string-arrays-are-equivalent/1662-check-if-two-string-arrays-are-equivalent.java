class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String s="";
        String s1="";
        
        for(int i=0;i<word1.length;i++){
            s+=word1[i];
        }
        for(int i=0;i<word2.length;i++){
            s1+=word2[i];
        }
        if(s.length()!=s1.length()){
            return false;
        }
        int j=0;
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)!=s1.charAt(j)){
               return false;
           }
           if(j<s1.length()-1){
               j++;
           }

        }
        return true;
    }
}