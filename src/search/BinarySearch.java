package search;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(10);
        System.out.println(binarySearch(nums, 1));
    }


    public static int binarySearch(List<Integer> nums, int target) {
        int i = 0, j = nums.size() - 1;

        while (i <= j) {
            //中点值m计算起点和终点的值除2，此处使用i加表示从起点走这么多顺序后到达终点值
            int m = i + (j - i) / 2;
            //表示需要查找的数据在起点到中点间，将终点设置为中点的前一个
            if (nums.get(m) > target) {
                j = m - 1;
                //表示需要查找的数据在中点到终点间，将起点设置为中点的后一个
            } else if (nums.get(m) < target) {
                i = m + 1;
                //中点值等于需要查找的数据，直接返回
            } else if (nums.get(m) == target){
                return m;
            }
        }
        //没查找到数据，返回-1
        return -1;
    }
}
