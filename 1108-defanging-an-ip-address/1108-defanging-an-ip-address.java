class Solution {
    public String defangIPaddr(String address) {
        int len = address.length() + 6;
        char[] IpAddress = new char[len];
        for(int i = 0, j = 0; j<address.length(); ++j){
            if (address.charAt(j) == '.') { 
                IpAddress[i++] = '[';
                IpAddress[i++] = '.';
                IpAddress[i++] = ']';
            }
            else {
                IpAddress[i++] = address.charAt(j);
            }
        }
        return new String(IpAddress);
    }
}