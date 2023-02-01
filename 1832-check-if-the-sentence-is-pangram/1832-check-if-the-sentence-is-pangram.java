class Solution {
    public boolean checkIfPangram(String sentence) {
        
        HashSet<Character> hs = new HashSet<Character>();
        
        for(int i = 0; i<sentence.length(); i++){
            hs.add(sentence.charAt(i));
        }

        return hs.size() == 26;
    }
}