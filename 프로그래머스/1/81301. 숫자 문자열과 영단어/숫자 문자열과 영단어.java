import java.util.*;

class Solution {
    public int solution(String s) {
        String str = s;
        String[] nums = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        StringBuilder sb = new StringBuilder();  // List → StringBuilder로 변경
        
        while(!str.isEmpty()) {  // ✅ 수정1: !isEmpty()
            char first = str.charAt(0);
            if(first >= '0' && first <= '9') {
                sb.append(first);
                str = str.substring(1);
                continue;
            }
            for(int i = 0; i < 10; i++) {
                if(str.startsWith(nums[i])) {  // ✅ 수정2: nums[i]
                    sb.append(i);
                    str = str.substring(nums[i].length());  // ✅ 수정3: nums[i].length()
                    break;
                }
            }
        }
        return Integer.parseInt(sb.toString());  // ✅ 수정4: StringBuilder.toString()
    }
}
