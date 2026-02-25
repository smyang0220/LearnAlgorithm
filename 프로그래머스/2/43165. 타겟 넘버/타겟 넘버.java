import java.util.*;
class Solution {
    
    private class XY{
        public final int x;
        public final int y;
        XY(int x, int y){
            this.x = x;
            this.y = y;
        }
        
    }
    
    
    
    public int solution(int[] numbers, int target){
        
        
        Stack<XY> stack = new Stack<>();
        stack.push(new XY(0,0));
        
    
        int count = 0;
        while(!stack.isEmpty()){
            XY xy = stack.pop();
            int x = xy.x;
            int y = xy.y;
            
            if(x == numbers.length){
                if(y == target) count++;
                continue;
            }
            
            stack.push(new XY(x+1,y+numbers[x]));
            stack.push(new XY(x+1,y-numbers[x]));
            
            
            
            
        }
        return count;
    }
}