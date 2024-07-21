class Solution {
    public String reformatDate(String date) {
        String[] str = date.split(" ");
        StringBuilder result = new StringBuilder();
        result.append(str[2]);
        result.append("-");
        String month = str[1].equals("Jan") ? "01" 
        : str[1].equals("Feb") ? "02" 
        : str[1].equals( "Mar" )? "03"
        : str[1].equals("Apr") ? "04"
        : str[1].equals("May") ? "05"
        : str[1].equals("Jun") ? "06"
        : str[1].equals("Jul") ? "07"
        : str[1].equals("Aug") ? "08"
        : str[1].equals("Sep") ? "09"
        : str[1].equals("Oct") ? "10"
        : str[1].equals("Nov") ? "11"
        : "12";
        result.append(month);
        result.append("-");
        if(str[0].length() == 3){
            result.append("0");
            result.append(str[0].charAt(0));
        }else{
            result.append(str[0].charAt(0));
            result.append(str[0].charAt(1));
        }
        return result.toString();
    }
}