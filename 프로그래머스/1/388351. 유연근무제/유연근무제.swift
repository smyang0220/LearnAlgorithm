import Foundation
func solution(_ schedules:[Int], _ timelogs:[[Int]], _ startday:Int) -> Int {
    
    var result = 0
    
    for (index, schedule) in schedules.enumerated() {
        var isTrue = true
        var day = startday
        
        // 출근 희망 시각에 10분을 더한 마감 시간 계산
        let scheduleHour = schedule / 100
        let scheduleMinute = schedule % 100
        var deadlineHour = scheduleHour
        var deadlineMinute = scheduleMinute + 10
        
        // 분이 60을 넘어가면 시간 조정
        if deadlineMinute >= 60 {
            deadlineHour += 1
            deadlineMinute -= 60
        }
        
        let deadline = deadlineHour * 100 + deadlineMinute
        
        for timelog in timelogs[index] {
            
            if isTrue == false {
                break
            }
            
            // 토요일(6)과 일요일(0)은 건너뛰기
            if day % 7 == 6 || day % 7 == 0 {
                day += 1
                continue
            }
            
            // 실제 출근 시간이 마감 시간보다 늦으면 false
            if timelog > deadline {
                isTrue = false
            }
            
            day += 1
        }
        
        if isTrue == true {
            result += 1
        }
    }
    
    return result
}