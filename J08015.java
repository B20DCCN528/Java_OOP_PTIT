import java.util.HashMap;
import java.util.Scanner;

public class J08015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long a[] = new long[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println(countPair(a, k));
        }
        

    }
    public static long countPair(long[] a, long k) {
        loong count = 0;
        HashMap<Long, Long> hm = new HashMap<>();
        for(int i = 0; i < a.length; i++) {
            if(!hm.containsKey(a[i])) hm.put(a[i], (long)1);
            else hm.put(a[i], hm.get(a[i]) + 1);
        }
        for(int i = 0; i < a.length; i++) {
            if(hm.get(k - a[i]) != NULL) count += hm.get(k - a[i]);
            if(k - a[i] == a[i]) count--;
        }
        return count/2;
    }
}