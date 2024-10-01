import Foundation

func main() {
    var V = Int(readLine()!)!
    
    var length = 9
    var M = 99999999
    
    var result = 0
    
    
    while length != 0 {
        
        if V > M {
           var num = V - M
            result += num * length
            V = M
        }
        
        length -= 1
        M = M / 10
    }
    
    print(result)
   
}

main()
