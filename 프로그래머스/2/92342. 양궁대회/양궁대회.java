import java.util.*;

class Solution {
    
    static int[] lion; 
    static int[] apeach;
    static int[] answer;
    static int diff;
    
    public int[] solution(int n, int[] info) {
        apeach = info;
        lion = new int[11];
        answer = new int[11];
        diff = Integer.MIN_VALUE;
        dfs(0, n);
        return diff > 0 ? answer : new int[]{-1};
    }
    
    public static void dfs(int depth, int arrow){
        if(depth == 11 || arrow == 0){
            int temp = lion[10];
            lion[10] += arrow;
            calDiff();
            lion[10] = temp;
            return;
        }
        
        // 어피치보다 1발 더 쏘는 경우
        if(apeach[depth] < arrow){
            lion[depth] = apeach[depth] + 1;
            dfs(depth+1, arrow - (apeach[depth] + 1));
            lion[depth] = 0;
        }
        
        // 해당 점수 포기하는 경우
        dfs(depth+1, arrow);
    }
    
    public static void calDiff(){
        int lionPoint = 0;
        int apeachPoint = 0;
        for(int i=0; i<11; i++){
            if(lion[i] > apeach[i]) lionPoint += (10-i);
            else if(apeach[i] > 0) apeachPoint += (10-i);
        }
        
        int semiDiff = lionPoint - apeachPoint;
        if(semiDiff > 0){
            if(semiDiff > diff){
                diff = semiDiff;
                answer = lion.clone();
            } else if(semiDiff == diff){
                for(int i=10; i>=0; i--){
                    if(lion[i] > answer[i]){
                        answer = lion.clone();
                        break;
                    } else if(lion[i] < answer[i]){
                        break;
                    }
                }
            }
        }
    }
}
