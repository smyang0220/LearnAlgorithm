class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = num_list.length;
        int index = 0;
        int[] answer = new int[size];
        for(int i = n; i < n+size; i++){
            answer[index] = num_list[i % size];
            index++;
        }
        
        return answer;
    }
}