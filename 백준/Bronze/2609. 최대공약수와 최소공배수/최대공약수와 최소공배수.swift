//
//  main.swift
//  bjbj
//
//  Created by 양희태 on 9/9/24.
//
import Foundation

func main(){
    let NM = readLine()!.split(separator: " ").map{ Int($0)! }
      
    let small = min(NM[0], NM[1])
    let large = max(NM[0], NM[1])
    
    print(gcd(a: large, b: small))
    print(lcm(a: large, b: small))
  
}


// 최대 공약수 : 두 수의 약수중 가장 큰녀석
func gcd(a : Int, b : Int) -> Int {
    var tmp : Int = 0
    var num1 = a
    var num2 = b
    while(num2 != 0){
        tmp = num1 % num2
        num1 = num2
        num2 = tmp
    }
    
    return num1
}

// 최소 공배수
func lcm(a : Int, b : Int) -> Int {
    return (a * b) / gcd(a: a, b: b)
}

main()
