import java.util.*;

class Solution {
    
    // 1. 생성자
    public static class Point{
        public final long x,y;
        private Point(long x, long y){
            this.x = x;
            this.y = y;
        }
    }
    
    //교점을 구하는 함수, 정수만
    public Point calPoint(long x1, long y1, long c1, long x2, long y2, long c2){
        
        double x = (double) (y1 * c2 - y2 * c1) / (x1 * y2 - x2 * y1);
        double y = (double) (x2 * c1 - x1 * c2) / (x1 * y2 - x2 * y1);
        
        if(x % 1 != 0 || y % 1 != 0){
            return null;
        }
        return new Point((long) x,(long) y);
    }
    
    public Point getMinPoint(List<Point> arr){
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;
        
        for(Point p : arr){
            if(x > p.x) x = p.x;
            if(y > p.y) y = p.y;
        }
        
        return new Point(x,y);
    }
    
    public Point getMaxPoint(List<Point> arr){
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;
        
        for(Point p : arr){
            if(x < p.x) x = p.x;
            if(y < p.y) y = p.y;
        }
        
        return new Point(x,y);
    }
    
    public String[] solution(int[][] line) {
        List<Point> points = new ArrayList<>();
        
        for(int i = 0; i < line.length; i++){
            for(int j = i+1; j < line.length; j++){
                
                Point p = calPoint(line[i][0],line[i][1],line[i][2],line[j][0],line[j][1],line[j][2]);
                
                if(p != null) points.add(p);
            }
        }
        
        Point minPoint = getMinPoint(points);
        Point maxPoint = getMaxPoint(points);
        int width = (int) (maxPoint.x - minPoint.x + 1);
        int height = (int) (maxPoint.y - minPoint.y + 1);

        char[][] arr = new char[height][width];
        for(char[] c : arr){
            Arrays.fill(c, '.');
        }
        
        for(Point p : points){
            int x = (int) (p.x - minPoint.x);
            int y = (int) (maxPoint.y - p.y);
            arr[y][x] = '*';
        }
        
        String[] answer = new String[arr.length];
        for(int i = 0; i < answer.length; i++){
            answer[i] = new String(arr[i]);
        }
        
        return answer;
    }
}