import Foundation

func main(){
    
    var isPrime = checkPrime(num: 1000000)
    
    while true {
        let num = Int(readLine()!)!
        
        if num == 0 {
            break
        }
        
        var isTrue = false
        
        for i in 2...(num/2){
            if isPrime[i] && isPrime[num-i] {
                print("\(num) = \(i) + \(num-i)")
                isTrue = true
                break
            }
        }
        
        if isTrue == false{
            print("Goldbach's conjecture is wrong.")
        }
        
    }
    
    
}

func checkPrime(num:Int) -> [Bool]{
  
    var isPrime = [Bool](repeating: true, count: num + 1)
    isPrime[0] = false
    isPrime[1] = false
    
    for i in 2...Int(sqrt(Double(num))){
        for j in stride(from: i*i, to: num + 1, by: i){
            isPrime[j] = false
        }
    }
    
    return isPrime
}

main()
