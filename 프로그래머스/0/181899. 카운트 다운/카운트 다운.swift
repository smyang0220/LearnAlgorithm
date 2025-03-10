import Foundation

func solution(_ start_num:Int, _ end_num:Int) -> [Int] {
    
    var answer : [Int] = []
    
    if start_num == end_num {
        return [start_num]
    } else{

    for i in (end_num...start_num).sorted(by: >) {
        answer.append(i)
    }
    
    return answer        
    }

}