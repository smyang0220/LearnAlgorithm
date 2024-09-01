import Foundation

func solution(_ angle: Int) -> Int {
    switch angle {
    case 0..<90:     // 0보다 크고 90보다 작은 경우
        return 1
    case 90:         // 90도인 경우
        return 2
    case 91..<180:   // 90보다 크고 180보다 작은 경우
        return 3
    case 180:        // 180도인 경우
        return 4
    default:
        return 0     // 유효하지 않은 각도에 대한 기본 반환 값
    }
}