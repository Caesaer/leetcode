public class No11 {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = 0;
        while (i < j){
            max = Math.max(max, (j-i)*Math.min(height[i],height[j]));
            if (height[j] < height[i])
                j--;
            else
                i++;
        }
        return max;
    }

    public static void main(String[] args){
        int[] height = {1,2,4,3};
        System.out.println(new No11().maxArea(height));
    }
}
