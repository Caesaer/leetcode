import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class No56 {

    static class Interval{
        int start;
        int end;
        Interval(){ start = 0; end = 0; }
        Interval(int s, int e){ start = s; end = e; }
    }

    class intervalCmp implements Comparator{
        public int compare(Object o1, Object o2){
            Interval in1 = (Interval)o1;
            Interval in2 = (Interval)o2;

            return (in1.start<=in2.start)? (in1.start==in2.start)? 0:-1 : 1;
        }
    }

    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new intervalCmp());

        for (int i = 0; i < intervals.size()-1;){
            Interval pre = intervals.get(i);
            Interval next = intervals.get(i+1);

            if (pre.end >= next.start){
                pre.start = Math.min(pre.start, next.start);
                pre.end = Math.max(pre.end, next.end);
                intervals.remove(next);
            }
            else
                i++;
        }
        return intervals;
    }

    public static void main(String[] args){
        List<Interval> list = new ArrayList<>();
        list.add(new Interval(2,3));
        list.add(new Interval(4,5));
        list.add(new Interval(6,7));
        list.add(new Interval(8,9));
        list.add(new Interval(1, 10));
        new No56().merge(list);

//        for (Interval obj : list)
//            System.out.print();


    }
}
