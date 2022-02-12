package com.ming.dayday;

import java.util.Arrays;

//1984. 学生分数的最小差值
/*
给你一个 下标从 0 开始 的整数数组 nums ，其中 nums[i] 表示第 i 名学生的分数。另给你一个整数 k 。
从数组中选出任意 k 名学生的分数，使这 k 个分数间 最高分 和 最低分 的 差值 达到 最小化 。
返回可能的 最小差值 。
示例 1：

输入：nums = [90], k = 1
输出：0
解释：选出 1 名学生的分数，仅有 1 种方法：
- [90] 最高分和最低分之间的差值是 90 - 90 = 0
可能的最小差值是 0
示例 2：

输入：nums = [9,4,1,7], k = 2
输出：2
解释：选出 2 名学生的分数，有 6 种方法：
- [9,4,1,7] 最高分和最低分之间的差值是 9 - 4 = 5
- [9,4,1,7] 最高分和最低分之间的差值是 9 - 1 = 8
- [9,4,1,7] 最高分和最低分之间的差值是 9 - 7 = 2
- [9,4,1,7] 最高分和最低分之间的差值是 4 - 1 = 3
- [9,4,1,7] 最高分和最低分之间的差值是 7 - 4 = 3
- [9,4,1,7] 最高分和最低分之间的差值是 7 - 1 = 6
可能的最小差值是 2
 
提示：
1 <= k <= nums.length <= 1000
0 <= nums[i] <= 105

* */
public class minimumDifference {
}
//首先顶一个变量为ans设置为最大值Integer.MAX_VALUE    Arrays.sort(nums); 对数组排序   排序然后用大小为k的窗口滑动找最小
//Math.min  两者对比取最小
class Solution {
    public int minimumDifference(int[] nums, int k) {
        int ans = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i+k-1<nums.length; i++) {
            ans = Math.min(ans, Math.abs(nums[i] - nums[i + k - 1]));
        }
        return ans;
    }
}
//先将数组进行排序 然后定义一个值为最小距离的差值   排序然后用大小为k的窗口滑动找最小
class Solution2 {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = nums[k-1] - nums[0];
        for(int i = 1 ; i <= nums.length-k ; i++){
            ans = Math.min( ans , nums[i+k-1] - nums[i]);
        }
        return ans;
    }
}

