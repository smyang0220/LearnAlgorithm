import Foundation

func main() {
    let ESM = readLine()!.split(separator: " ").map { Int($0)! }
    let (E, S, M) = (ESM[0], ESM[1], ESM[2])
    
    var e = 1, s = 1, m = 1
    var year = 1
    
    // E, S, M 값을 만족할 때까지 연도를 증가시킴
    while e != E || s != S || m != M {
        year += 1
        e += 1
        s += 1
        m += 1
        
        // 각 주기별로 값이 넘어가면 1로 초기화
        if e > 15 { e = 1 }
        if s > 28 { s = 1 }
        if m > 19 { m = 1 }
    }
    
    print(year)
}

main()
