import Foundation

func solution(_ n: Int) -> Int {
    var result: [Int] = []
    
    // 숫자를 문자열로 변환한 다음, 각 문자를 Int로 변환하여 배열로 저장
    result = String(n).compactMap { Int(String($0)) }
    
    // 예제: 각 자리수의 합을 반환하는 것으로 설정
    return result.reduce(0, +)
}