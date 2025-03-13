import Foundation

// 전역 변수로 선언
var map = [[Character]]()
var width = 0
var height = 0

func solution(_ park:[String], _ routes:[String]) -> [Int] {
    var now = [0, 0]
    
    // 맵 구성 및 시작 위치 찾기
    for (row, i) in park.enumerated() {
        map.append([])
        for (column, j) in i.enumerated() {
            if j == "S" {
                now = [row, column]
            }
            map[row].append(j)
        }
    }
    
    // 맵 크기 저장
    height = map.count
    width = map[0].count
    
    // 경로 탐색
    for route in routes {
        let info = route.split(separator: " ")
        let direction = Character(String(info[0]))
        let distance = Int(String(info[1]))!
        
        now = move(now, direction, distance)
    }
    
    return now
}

// 이동 처리 함수
func move(_ now: [Int], _ way: Character, _ walk: Int) -> [Int] {
    var x = now[0]
    var y = now[1]
    
    switch way {
        // 북 (North)
        case "N":
            for _ in 1...walk {
                if x - 1 < 0 || map[x-1][y] == "X" {
                    return [now[0], now[1]]
                }
                x -= 1
            }
            return [x, y]
        // 남 (South)
        case "S":
            for _ in 1...walk {
                if x + 1 >= height || map[x+1][y] == "X" {
                    return [now[0], now[1]]
                }
                x += 1
            }
            return [x, y]
        // 서 (West)
        case "W":
            for _ in 1...walk {
                if y - 1 < 0 || map[x][y-1] == "X" {
                    return [now[0], now[1]]
                }
                y -= 1
            }
            return [x, y]
        // 동 (East)
        case "E":
            for _ in 1...walk {
                if y + 1 >= width || map[x][y+1] == "X" {
                    return [now[0], now[1]]
                }
                y += 1
            }
            return [x, y]
        default:
            return now
    }
}