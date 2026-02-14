import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        ArrayList<String> list = new ArrayList<>();
        for(String s : answer){
            if(!s.isEmpty()){
                list.add(s);
            }
        }
        String[] asw = list.toArray(new String[list.size()]);
        Arrays.sort(asw);
        return asw;
    }
}