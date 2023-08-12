class Solution {
    public int percentageLetter(String s, char letter) {
        int length = s.length();
        int count = 0;
        int perc = 0;
        for (int i = 0; i < length; i++)
        {
            if(s.charAt(i) == letter)
                count++;
        }
        perc = ((count * 100) / length);
        return perc;
    }
}