import Foundation

func solution(_ n:Int) -> Int {
    // 7개가 주어진다.
    var pizza = n
    var result = 0
    while(pizza > 0){
        result += 1
        pizza -= 7
    }
    
    return result
}