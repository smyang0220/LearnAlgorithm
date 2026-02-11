class Solution {
    public int solution(String my_string, String is_suffix) {
        int suflen = is_suffix.length();
        if(suflen > my_string.length()){
            return 0;
        }
        return my_string.substring(my_string.length() - suflen).equals(is_suffix) ? 1 : 0;
    }
}