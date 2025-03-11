import Foundation

func solution(_ dot:[Int]) -> Int {
    
    let x = dot[0]
    let y = dot[1]
    
    if x > 0 && y >= 0 {
        return 1
    }else if x > 0 && y < 0{
        return 4
    }else if x < 0 && y < 0 {
        return 3
    }else {
        return 2
    }
    
    return 0
}