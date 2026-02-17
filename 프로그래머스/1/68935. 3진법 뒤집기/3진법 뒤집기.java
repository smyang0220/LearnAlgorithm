import java.util.*;
class Solution {
    public int solution(int n) {
    String str = Integer.toString(n,3);
    StringBuilder sb = new StringBuilder();
    sb.append(str);
    int answer = Integer.parseInt(sb.reverse().toString(),3);
    
    return answer;
    }
}