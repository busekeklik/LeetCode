class Solution {
    public boolean judgeCircle(String moves) {
        int UpDown = 0;
        int LeftRight = 0;
        for (char c : moves.toCharArray() )
        {
            if (c == 'U')
                UpDown++;
            else if (c == 'D')
                UpDown--;
            else if (c == 'R')
                LeftRight++;
            else if (c == 'L')
                LeftRight--;
        }
        return (LeftRight == 0 && UpDown == 0);
    }
}