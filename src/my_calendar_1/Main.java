package my_calendar_1;


import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        MyCalendar calendar = new MyCalendar();
        System.out.println(calendar.book(10, 20));
        System.out.println(calendar.book(10, 20));
        System.out.println(calendar.book(10, 20));
        System.out.println(calendar.book(10, 20));
    }


    static class MyCalendar {

        Set<Event> set;

        public MyCalendar() {
            set = new TreeSet<>();
        }

        public boolean book(int start, int end) {
            // (10, 20) (20, 30), (10, 50)

            //
            set.add(new Event(start, end));
            System.out.println(set);



            return true;
        }

        static class Event implements Comparable<Event>{
            int start, end;


            public Event(int start, int end) {
                this.start = start;
                this.end = end;
            }

            int getStart() {
                return start;
            }

            int getEnd() {
                return end;
            }

            @Override
            public String toString() {
                return super.toString();
            }

            @Override
            public int compareTo(Event o) {
                return start - o.start;
            }
        }
    }
}
