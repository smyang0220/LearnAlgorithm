import Foundation

func solution(_ num_list:[Int]) -> Int {
    
    if num_list.count > 10 {
        return num_list.reduce(0,+)
    }else{
        return num_list.reduce(1,*)
    }
}