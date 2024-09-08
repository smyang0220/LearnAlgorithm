//
//  main.swift
//  bjbj
//
//  Created by 양희태 on 9/9/24.
//
import Foundation


   
    let NM = readLine()!.split(separator: " ").map { Int($0)! }
    let (N,M) = (NM[0] , NM[1])
    var result : [Int] = []
    
    func repeatNum(_ num : String) {
        let xyz = num.map{ Int(String($0))! }
        
        var sum = 0
        
        
        for i in xyz {
            sum += Int(pow(Double(i), Double(M)))
        }
        
        
        if result.contains(sum){
            return print("\(result.firstIndex(of: sum)!)")
        }
        result.append(sum)
        repeatNum(String(sum))
        
    }
    
    result.append(N)
    repeatNum(String(N))
    
    

