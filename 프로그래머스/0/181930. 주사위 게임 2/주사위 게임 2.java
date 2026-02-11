class Solution {
    public int solution(int a, int b, int c) {
        int sum1 = a + b + c;                         // a + b + c
        int sum2 = a*a + b*b + c*c;                   // a^2 + b^2 + c^2
        int sum3 = a*a*a + b*b*b + c*c*c;             // a^3 + b^3 + c^3

        // 세 숫자가 모두 같은 경우
        if (a == b && b == c) {
            return sum1 * sum2 * sum3;
        }
        // 두 숫자만 같은 경우
        else if (a == b || b == c || a == c) {
            return sum1 * sum2;
        }
        // 모두 다른 경우
        else {
            return sum1;
        }
    }
}
