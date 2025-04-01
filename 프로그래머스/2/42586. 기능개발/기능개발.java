import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        //7 2.3 . 11 
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < progresses.length; i++){
            queue.offer((int) Math.ceil((100.0-progresses[i])/speeds[i]));
        }
        
        
        while(!queue.isEmpty()){
            int day = queue.poll();
            int count = 1;
            while(!queue.isEmpty() && queue.peek() <= day){
                queue.poll();
                count++;
            }
            answer.add(count);
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}