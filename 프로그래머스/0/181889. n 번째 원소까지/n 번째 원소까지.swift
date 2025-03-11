import Foundation

func solution(_ num_list:[Int], _ n:Int) -> [Int] {
    
    var result : [Int] = []
    
    for (index, num) in num_list.enumerated() {
        if index == n {
            return result
        }
        result.append(num)
    }
    
    return result
}