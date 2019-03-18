import java.util.ArrayList;
import java.util.List;

public class No120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() == 0)
            return 0;
        if (triangle.size() == 1)
            return triangle.get(0).get(0);

        for (int i = triangle.size()-2; i >= 0; i --){
            List<Integer> current = triangle.get(i);
            List<Integer> pre = triangle.get(i+1);
            for (int j = 0; j < current.size(); j++)
                current.set(j, current.get(j) + Math.min(pre.get(j), pre.get(j+1)));
        }

        return triangle.get(0).get(0);
    }

    public static void main(String[] args){
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        List<Integer> list3 = new ArrayList<>();
        list3.add(6);
        list3.add(5);
        list3.add(7);
        List<Integer> list4 = new ArrayList<>();
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);

        triangle.add(list1);
        triangle.add(list2);
        triangle.add(list3);
        triangle.add(list4);
        System.out.println(new No120().minimumTotal(triangle));
    }
}
