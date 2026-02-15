class Solution {
    public int solution(int[] date1, int[] date2) {
        
        // 연도 검증
        if(date1[0] < date2[0]){
            return 1;
        }  
        
        //월 검증
        if(date1[1] < date2[1]){
            if(date1[0] > date2[0]){
                return 0;
            }else{
                return 1;
            }
        }
        
        // 일검증
        if(date1[2] < date2[2]){
            if(date1[1] > date2[1]){
                return 0;
            }else{
                return 1;
            }
        }
        
        return 0;
       
    }
}