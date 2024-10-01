//
//  main.swift
//  bjbj
//
//  Created by 양희태 on 9/9/24.
//
import Foundation

func main(){
    
    let NML = readLine()!.split(separator: " ").map{ Int($0)! }
    
    let (A,B,C) = (NML[0], NML[1], NML[2])
    
    print((A+B)%C)
    print(((A%C) + (B%C))%C)
    print((A*B)%C)
    print( ((A%C) * (B%C))%C)
}

main()


   



