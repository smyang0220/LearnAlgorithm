import Foundation

func solution(_ n:Int) -> [Int] {
    
    var array = Array(1...n)
    
    let result = array.filter { $0 % 2 == 1 }
    
    return result
}