import Foundation

func main(){
    let NM = readLine()!.split(separator: " ").map{ Int($0)! }
    
    for i in NM[0]...NM[1]{
        if i < 2 {
            continue
        }
        var isPrime = true
        for j in 2..<Int(sqrt(Double(i)) + 1) {
            if i % j == 0 {
                isPrime = false
            }
        }
        
        if isPrime == true {
            print(i)
        }
        
    }
  
}

main()
