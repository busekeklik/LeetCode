class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() -1;
        char[] cs = s.toCharArray();

        while(i < j){
            if (checkVowel(cs[i])){
                while(i < j){
                    if (checkVowel(cs[j])){
                        char temp = cs[i];
                        cs[i] = cs[j];
                        cs[j] = temp;
                        j--;
                        break;
                    }
                    j--;
                }
            }
            i++;
        }
        return new String(cs);
    }
    public boolean checkVowel(char a){
         return (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'
                || a == 'A' || a == 'E' || a == 'I' || a == 'O'
                || a == 'U') ? true : false;

    }
}