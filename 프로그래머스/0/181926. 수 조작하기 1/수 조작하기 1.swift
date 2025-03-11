import Foundation

func solution(_ n:Int, _ control:String) -> Int {
    
    var result = n
    
    for alp in control {
        if alp == "w"{
            result += 1
        } else if alp == "s" {
            result -= 1
        }else if alp == "d" {
            result += 10
        }else{
            result -= 10
        }
    }
    
    return result
}