//
//  main.swift
//  bjbj
//
//  Created by 양희태 on 9/9/24.
//
import Foundation


    
    // 배열 크기
    let size = Int(readLine()!)!
    
    var arr : [[Int]] = []
    
    var maxHeight = 0
    
    var safeArea = 0
    
    let dx = [0,0,-1,1]
    let dy = [1,-1,0,0]
    
    for i in 0..<size{
        arr.append(readLine()!.split(separator: " ").map { Int($0)! })
        for j in arr[i]{
            if maxHeight < j {
                maxHeight = j
            }
        }
    }
    
    func findHigher(_ rain : Int) {
      var visited = [[Bool]](repeating: Array(repeating: false, count: size), count: size)
      
      var count = 0
        
      for i in 0..<size {
            for j in 0..<size{
                if arr[i][j] > rain && visited[i][j] == false{
                    findSafeArea([i,j] , &visited, rain)
                    count += 1
                }
            }
        }
        
        if safeArea < count {
            safeArea = count
        }
    }
    
    func findSafeArea(_ XY : [Int], _ visited : inout [[Bool]] , _ height : Int){
        var queue = [[Int]]()
        queue.append(XY)
        
        while !queue.isEmpty{
            let XY = queue.removeFirst()
            let x = XY[0]
            let y = XY[1]
            if visited[x][y] == false {
                visited[x][y] = true
                
                for i in 0..<4{
                   let nx = x + dx[i]
                   let ny = y + dy[i]
                   
                    guard nx >= 0 && ny >= 0 && nx < size && ny < size && arr[nx][ny] > height else {
                        continue
                    }
                    
                    queue.append([nx,ny])
                    
                }
                
            }
        }
        
        
    }
    
    for i in 0..<maxHeight {
        findHigher(i)
    }
    
    print(safeArea)
    

