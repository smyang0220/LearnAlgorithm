import Foundation

func solution(_ my_string: String, _ n: Int) -> String {
    let startIndex = my_string.startIndex
    let endIndex = my_string.index(startIndex, offsetBy: n)
    let result = String(my_string[startIndex..<endIndex])
    
    return result
}