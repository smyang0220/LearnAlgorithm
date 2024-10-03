import Foundation

var flag: [[Bool]] = [[]]
var result: [Int] = []
var nums: [[Int]] = [[]]
let dx = [-1, 0, 1, 0]
let dy = [0, 1, 0, -1]
var N: Int = 0
var M: Int = 0
var K: Int = 0
var maxnum = Int.min

func main() {
    let NMK = readLine()!.split(separator: " ").map { Int($0)! }
    (N, M, K) = (NMK[0], NMK[1], NMK[2])
    
    nums = [[Int]](repeating: [Int](repeating: 0, count: M), count: N)
    for i in 0..<N {
        nums[i] = readLine()!.split(separator: " ").map { Int($0)! }
    }
    flag = [[Bool]](repeating: [Bool](repeating: false, count: M), count: N)
    
    backtracking(depth: 0, start: 0)
    print(maxnum)
}

func backtracking(depth: Int, start: Int) {
    if depth == K {
        let sum = result.reduce(0, +)
        maxnum = max(maxnum, sum)
        return
    }
    
    for count in start..<N * M {
        let i = count / M
        let j = count % M
        
        if !flag[i][j] {
            // 인접 칸이 선택되어 있는지 체크
            var canSelect = true
            for dir in 0..<4 {
                let ni = i + dx[dir]
                let nj = j + dy[dir]
                if ni >= 0 && ni < N && nj >= 0 && nj < M && flag[ni][nj] {
                    canSelect = false
                    break
                }
            }
            
            if canSelect {
                flag[i][j] = true
                result.append(nums[i][j])
                backtracking(depth: depth + 1, start: count + 1) // 다음 인덱스부터 진행
                result.removeLast()
                flag[i][j] = false
            }
        }
    }
}

main()
