import Foundation

var flag : [Bool] = []
var result : [Int] = []
func main() {
    
    let NM = readLine()!.split(separator: " ").map{ Int($0)! }
    
    let (N , M) = (NM[0], NM[1])
   
    flag = [Bool](repeating: false, count: N+1)
    
    logic(N: N, M: M, depth: 0)
    
}

// 이 함수에서 M 카운트까지 도달하면 돌아오기
func logic(N : Int, M : Int, depth : Int) {
    
    if M == depth {
        // 프린트
        print(result.map { String($0) }.joined(separator: " ") )
        return
    }
    
    for i in 1...N {
        if flag[i] == false {
            flag[i] = true
            result.append(i)
            logic(N: N, M: M, depth: depth+1)
            result.removeLast()
            flag[i] = false
        }
    }
}

main()
