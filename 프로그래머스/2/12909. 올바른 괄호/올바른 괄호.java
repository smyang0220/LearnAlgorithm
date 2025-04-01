import java.util.*;

class Solution {
    boolean solution(String s) {

        char[] arr = s.toCharArray();
        
        Stack<Character> stack = new Stack<>();
        
        // ) 가 나오면 스택에 넣고, ( 가 나오면 스택에서 꺼내자.
        
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == ')'){
                stack.push(')');
            }else{
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
        
        if(!stack.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
}