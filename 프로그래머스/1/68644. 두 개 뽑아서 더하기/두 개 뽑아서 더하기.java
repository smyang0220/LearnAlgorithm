import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        // Use a Set to store unique sums
        Set<Integer> sumSet = new HashSet<>();
        
        // Find all unique pairs and add their sums to the set
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sumSet.add(numbers[i] + numbers[j]);
            }
        }
        
        // Convert set to list and sort
        List<Integer> sumList = new ArrayList<>(sumSet);
        Collections.sort(sumList);
        
        // Convert list to array
        int[] answer = new int[sumList.size()];
        for (int i = 0; i < sumList.size(); i++) {
            answer[i] = sumList.get(i);
        }
        
        return answer;
    }
}
