import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static class Person{
        int age;
        String name;

        public Person(int age, String name){
            this.age = age;
            this.name = name;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Person> arr = new ArrayList<>();

       // for (int i = 0; i < N; i++) {
       //      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       //      // 입력 순서를 인덱스로 저장
       //      list.add(new Person(Integer.parseInt(st.nextToken()), st.nextToken(), i)); // i는 입력 순서
       //  }
        
       //  // 나이 기준 오름차순, 나이 같으면 입력 순서 오름차순
       //  list.sort(Comparator.comparingInt(Person::getAge)
       //                      .thenComparingInt(Person::getIndex));
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            // 입력 순서를 인덱스로 저장
            arr.add(new Person(Integer.parseInt(st.nextToken()), st.nextToken())); // i는 입력 순서
        }

        arr.sort((a,b) -> Integer.compare(a.age,b.age));

        for(Person p : arr){
            System.out.printf("%s %s\n", p.age, p.name);
        }
    }
}