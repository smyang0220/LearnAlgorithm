import Foundation

func main(){
    let NM = Int(readLine()!)!
    
   var sum = 0
    for i in 1...NM {
        sum += (NM/i) * i
    }
  
    print(sum)
}

main()
