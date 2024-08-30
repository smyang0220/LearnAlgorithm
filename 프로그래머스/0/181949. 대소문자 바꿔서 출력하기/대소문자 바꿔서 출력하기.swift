import Foundation

let s1 = readLine()!

for i in s1{
    if i.isLowercase{
        print(i.uppercased(), terminator: "")
    }else{
        print(i.lowercased(), terminator: "")
    }
}