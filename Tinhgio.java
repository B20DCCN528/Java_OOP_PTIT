import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tinhgio {
    private static class GameThu implements Comparable<GameThu> {
        private String id, name, timeIn, timeOut;
        private int hour, min;
        public GameThu(String id, String name, String timeIn, String timeOut) {
            this.id = id;
            this.name = name;
            this.timeIn = timeIn;
            this.timeOut = timeOut;
            this.hour = Integer.parseInt(timeOut.substring(0,2)) - Integer.parseInt(timeIn.substring(0,2));
            this.min = Integer.parseInt(timeOut.substring(3)) - Integer.parseInt(timeIn.substring(3));
            if(this.min < 0) {
                this.min += 60;
                this.hour--;
            }
        }
        @Override
        public String toString() {
            return this.id + ' ' + this.name + ' ' + String.valueOf(this.hour) + " gio " + String.valueOf(this.min) + " phut";
        }
        @Override
        public int compareTo(GameThu p) {
            if(this.hour < p.hour) return 1;
            if(this.hour > p.hour) return -1;
            if(this.min < p.min) return 1;
            return -1;
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<GameThu> ds = new ArrayList<>();
        while(t --> 0) {
            ds.add(new GameThu(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(ds);
        for(GameThu tmp : ds) {
            System.out.println(tmp);
        }
    }   
}
