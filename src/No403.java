
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class No403 {
    //超时
/*    public boolean canCross(int[] stones){
        int offset = 0;
        return search(stones, 0, offset);
    }

    public boolean search(int[] stones, int i, int offfset){
        if (i == stones.length - 1)
            return true;

        for (int j = offfset - 1; j <= offfset + 1; j ++){
            int next = stones[i] + j;
            int nextjump = Arrays.binarySearch(stones,i+1,stones.length,next);
            if (nextjump > 0)
                if (search(stones,nextjump,j))
                    return true;
        }

        return false;
    }

*/

    public boolean canCross(int[] stones){
        int next;
        LinkedHashMap<Integer,HashSet<Integer>> map = new LinkedHashMap<>();
        for (int i = 0; i < stones.length; i++)
            map.put(stones[i],new HashSet<>());

        map.get(0).add(1);
        for (int i = 0; i < stones.length - 1; i++){
            for (int jump : map.get(stones[i])) {
                next = stones[i] + jump;
                if (next == stones[stones.length - 1])
                    return true;

                HashSet<Integer> temp = map.get(next);
                if (temp != null) {
                    temp.add(jump);
                    if (jump - 1 > 0)
                        temp.add(jump - 1);
                    temp.add(jump+1);
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] stones = {0,1,3,6,10,13,15,18};
        boolean bool = new No403().canCross(stones);
        System.out.println(bool);
    }
}
