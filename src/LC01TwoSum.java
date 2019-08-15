public class LC01TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] Ans = new int[2];
        for(int i = 0;i < nums.length;i++){
            for (int j = 0; j < nums.length; j++) {
                if(target == (nums[i] + nums[j])){
                    if(i > j){
                        i = i + j;
                        j = i - j;
                        i = i - j;
                    }
                    Ans[0]= i;
                    Ans[1]= j;
                    break;
                }
            }
        }
        return Ans;
    }
}
