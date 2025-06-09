import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        
        StringBuilder sb = new StringBuilder();
        
        char[] arr1 = X.toCharArray();
        char[] arr2 = Y.toCharArray();
        
        int[] numArr1 = new int[10];
        int[] numArr2 = new int[10];
        
        int[] sameNum = new int[10];
        
        boolean same = false;
        
        for(int num : arr1){
            numArr1[num - '0']++;
        }
        
         for(int num : arr2){
            numArr2[num - '0']++;
        }
        
        for(int i = 0; i < 10; i++){
            
            int num = Math.min(numArr1[i],numArr2[i]);
            
            if(num>0){
                same = true;
            }
                
            sameNum[i] = num;
        }
        
        if(same){
            for(int i = 9; i>=0; i--){
                int count = sameNum[i];
                for(int j = 0; j<count; j++){
                    sb.append(i);
                }
            }
            
            String answer = sb.toString();
            
            if(answer.replace("0","").length() == 0){
                return "0";
            }
            
            return answer;
        }else{
            return "-1";
        }
        
    }
}