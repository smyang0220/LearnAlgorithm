import Foundation

func main() {
    
    var V = Int(readLine()!)!
    
        var dp = [Int](repeating: 0, count: 12)    
        dp[1] = 1
        dp[2] = 2
        dp[3] = 4
        for i in 4...11 {
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1]
        }
    for _ in 0..<V {
        
        var N = Int(readLine()!)!
    
        
        print(dp[N])
        
    }
    
    
   
}


main()
