import Foundation

func solution(_ my_string:String, _ letter:String) -> String {
    
    var result : String = ""
    var check : Character = letter.first!
    
    for alp in my_string {
        if alp == check {
            continue
        }
        result.append(alp)
    }
    
    return result
}