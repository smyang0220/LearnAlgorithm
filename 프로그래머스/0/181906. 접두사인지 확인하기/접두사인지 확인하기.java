class Solution {
    public int solution(String my_string, String is_prefix) {
        int P_length = is_prefix.length();
        if(my_string.length() < P_length) return 0;
        return my_string.substring(0,P_length).equals(is_prefix) ? 1 : 0;
    }
}