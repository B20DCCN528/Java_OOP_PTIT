import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Trenhatgianhat {
    private static class Person implements Comparable<Person>{
        private String name,birthDay;

        public Person(String name, String birthDay) {
            this.name = name;
            this.birthDay = toDate(birthDay);
        }
        static String toDate(String s){
            String [] data = s.split("/");
            return data[2]+'/'+data[1]+'/'+data[0];
        }

        @Override
        public int compareTo(Person o) {
            return this.birthDay.compareTo(o.birthDay);
        }
    }
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        ArrayList<Person> ds = new ArrayList<>();
        while(t-->0){      
            ds.add(new Person(sc.next(),sc.next()));
        }
        Collections.sort(ds);
        System.out.println(ds.get(ds.size()-1).name);
        System.out.println(ds.get(0).name);
    }
}
