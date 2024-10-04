import Foundation

func solution(_ citations:[Int]) -> Int {
    
    var sorted = citations.sorted(by: >) // 내림차순 정렬
    
    
    // [6,5,3,1,0]
    for h in (1...sorted.count).reversed() {
        if sorted[h-1] >= h {
            return h
        } 
    }
    return 0
}