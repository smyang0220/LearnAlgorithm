//
//  main.swift
//  bjbj
//
//  Created by 양희태 on 9/9/24.
//
import Foundation

func main(){
    let tmp = readLine()!
    let NM = readLine()!.split(separator: " ").map{ Int($0)! }
      
    let N = NM.min()!
    let M = NM.max()!
    
    let result = Int(N * M)
    
    print(result)
}



main()
