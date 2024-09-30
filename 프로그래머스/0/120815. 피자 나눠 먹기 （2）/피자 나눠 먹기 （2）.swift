import Foundation

func solution(_ n:Int) -> Int {
    
    var pizzaSlice = 6
    var count = 1
    while (pizzaSlice % n != 0){
        pizzaSlice += 6   
        count += 1
    }
    
    
    return count
}