import Foundation

func solution(_ name:[String], _ yearning:[Int], _ photo:[[String]]) -> [Int] {
    
    var result : [Int] = []
    
    for (index,people) in photo.enumerated() {
        
        var score = 0
        
        for photoName in people {
            if let nameIndex = name.firstIndex(of:photoName) {
                score += yearning[nameIndex]
            }
        }
        
        result.append(score)
    }
    return result
}