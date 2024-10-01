import Foundation


var kitty : [Int] = []
var flag = [Bool](repeating: false, count: 9)
var result = [Int]()

func main(){
    
    for _ in 0..<9 {
        let size = Int(readLine()!)!
        
        kitty.append(size)
        
    }
    
    find(start: 0, size: 0, count: 0)
    
    result.sort()
    
    for i in result {
        print(i)
    }
    
}


func find(start : Int , size : Int, count : Int){
    
    
    if count == 7 {
       if size == 100 {
           result = []
           for i in 0..<9 {
               if flag[i] {
                   result.append(kitty[i])
               }
           }
        }
        return
    }
    
    for i in start..<9 {
        if !flag[i] {
            flag[i] = true
            find(start: i+1, size: size+kitty[i], count: count+1)
            flag[i] = false
        }
    }
    
}

main()
