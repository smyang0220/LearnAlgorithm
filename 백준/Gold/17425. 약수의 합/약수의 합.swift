import Foundation

func main(){
    
    // 약수의 합
    var dp = [Int](repeating: 1, count: 1000001)
    // 누적합
    var s = [Int](repeating: 1, count: 1000001)
    
    for i in 2...1000000 {
        var j = 1
        
        while i*j <= 1000000 {
            dp[i*j] += i
            j += 1
        }
    }
    
    for i in 2...1000000 {
        s[i] = s[i-1] + dp[i]
    }
    
    
    let N = Int(readLine()!)!
    
    for _ in 0..<N {
        
        let M = Int(readLine()!)!
        
        print(s[M])

    }
 
}

main()
