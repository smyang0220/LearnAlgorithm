import Foundation

func solution(_ my_string:String) -> String {
    
    var result = ""
    
    for alp in my_string.reversed() {
        
        result.append(alp)
        
    }
    
    return result
}