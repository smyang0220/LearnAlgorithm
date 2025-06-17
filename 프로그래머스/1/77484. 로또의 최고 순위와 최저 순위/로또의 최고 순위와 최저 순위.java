class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int unknown = 0;
        int match = 0;
        
        for(int num : lottos){
            if(num == 0){
                unknown++;
            }
        }
        
        for(int i = 0; i <6; i++){
            for(int j = 0; j < 6; j++){
                if(win_nums[i]==lottos[j]){
                    match++;
                }
            }
        }
        
        answer[0] = calRank(match,unknown);
        answer[1] = calRank(match,0);
        
        return answer;
    }
    
    public int calRank(int match, int unknown){
        int matchCount = match + unknown;
        switch(matchCount){
            case 2:
                return 5;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 2;
            case 6:
                return 1;
            default:
                return 6;
        }   
    }
}