import Foundation

func solution(_ todo_list:[String], _ finished:[Bool]) -> [String] {
    
    var answer : [String] = []
    
    for (index,i) in finished.enumerated() {
        if i == false {
            answer.append(todo_list[index])
        }
    }
    
    return answer
}