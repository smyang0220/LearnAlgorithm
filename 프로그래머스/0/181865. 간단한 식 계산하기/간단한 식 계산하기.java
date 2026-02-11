class Solution {
    public int solution(String binomial) {
        
        String[] charArr = binomial.split(" ");
        int a = Integer.parseInt(charArr[0]);
        int b = Integer.parseInt(charArr[2]);
        if(charArr[1].equals("+")){
            return a+b;
        }else if(charArr[1].equals("-")){
            return a-b;
        }else{
            return a * b;
        }
    }
}