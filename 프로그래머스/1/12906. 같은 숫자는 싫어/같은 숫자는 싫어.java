import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(int []arr) {
        int tmp = 10;
        ArrayList<Integer> arrr = new ArrayList<>();
        for(int i=0;i<arr.length ;i++){
            if(tmp != arr[i]) {
                tmp = arr[i];
                arrr.add(tmp);
                }
    
        }

        return arrr;
    }
}