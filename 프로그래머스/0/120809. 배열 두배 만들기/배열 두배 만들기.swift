import Foundation

func solution(_ numbers:[Int]) -> [Int] {
    
    var answers : [Int] = []
    
    answers = numbers.map{
        $0 * 2
    }
    return answers
}