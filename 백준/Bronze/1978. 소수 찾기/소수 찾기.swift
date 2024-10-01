//
//  main.swift
//  bjbj
//
//  Created by 양희태 on 9/9/24.
//
import Foundation

func main(){
    
    let N = Int(readLine()!)!
    let NML = readLine()!.split(separator: " ").map{ Int($0)! }
    
    var count = 0
    
    for i in 0..<N {
        if NML[i] <= 1{
            continue
        }
        
        
        var isPrime = false
        for j in 2..<Int(sqrt(Double(NML[i]))+1){
            if NML[i] % j == 0 {
                isPrime = true
                break
            }
        }
        
        if isPrime == false{
            count+=1
        }
        
    }
    print(count)
    
}

main()
