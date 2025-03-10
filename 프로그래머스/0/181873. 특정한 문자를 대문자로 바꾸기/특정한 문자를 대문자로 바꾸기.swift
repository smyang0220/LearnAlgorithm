import Foundation

func solution(_ my_string:String, _ alp:String) -> String {
   
    var answer = ""
    let check = Character(alp)
    
    for i in my_string {
        if i == check {
            answer.append(i.uppercased())
        }else{
            answer.append(i)
        }
    }
    
    return answer
    
}