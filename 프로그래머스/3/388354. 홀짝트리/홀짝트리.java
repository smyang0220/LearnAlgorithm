import java.util.*;


class Solution {
    
    static Map<Integer,List<Integer>> graph = new HashMap<>();
    static boolean[] visited = new boolean[1000001]; // edges크기 1,000,000
    
    public int[] solution(int[] nodes, int[][] edges) {
        int[] answer = new int[2];
        
        for(int node : nodes){
            graph.put(node,new ArrayList<>());
        }
        
        for(int[] edge: edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        
        for(int node : nodes){
            if(!visited[node] && isHolZzak(node,0)){
                answer[0]++;
            }
        }
        
        Arrays.fill(visited,false);
        
         for(int node : nodes){
            if(!visited[node] && isReverseHolZzak(node,0)){
                answer[1]++;
            }
        }
        
        return answer;
    }
    
    static boolean isHolZzak(int start, int parent){
        List<Integer> arr = graph.get(start);
        int size = arr.size() - 1;
        
        if(parent == 0){
            size++;
        }
        
        if(start % 2 == size % 2){
            visited[start] = true;
            for(int child : arr){
                if(child == parent) continue;
                if(!isHolZzak(child, start)){ // 만약 홀짝이 아니면 방문 배열 초기화해야함
                    visited[start] = false;
                    return false;
                }
            }
        } else{
            return false;
        }
        return true;
    }
    
    static boolean isReverseHolZzak(int start, int parent){
        List<Integer> arr = graph.get(start);
        int size = arr.size() - 1;
        
        if(parent == 0){
            size++;
        }
        
        if(start % 2 != size % 2){
            visited[start] = true;
            for(int child : arr){
                if(child == parent) continue;
                if(!isReverseHolZzak(child, start)){ // 만약 홀짝이 아니면 방문 배열 초기화해야함
                    visited[start] = false;
                    return false;
                }
            }
        } else{
            return false;
        }
        return true;
    }
    
}