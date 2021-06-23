public class twoSum {
    public class Outside{
        int out = 1;
        public class Inside{
            int  y = 2;
        }

    }
    /**
     * Given an array of integers nums and an integer target,
     * return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     * @param nums
     * @param target
     * @return indices of the two numbers such that they add up to target.
     */
    public int[] twoSum(int[] nums, int target) {
        return recursiveSolution(nums,target);
    }

    private int[] recursiveSolution(int[] nums, int target) {
        //base
        if(nums.length == 0 || nums.length == 1) {
            int [] result = {0,0};
            return  result;
        }
        //recursion
        return recursiveSolutionHelper(nums,target,target);
    }
    private int[] recursiveSolutionHelper(int [] nums,int target,int targetleft){
        int [] result = {0,0};
        //if (targetleft == 0)
            return result;
    }

    public static void main(String[] args) {

        twoSum two = new twoSum();
        twoSum.Outside out = two.new Outside();
        System.out.println("Out : " + out.out);
        twoSum.Outside ntwo = (new twoSum()).new Outside();
        System.out.println("ntwo : " + ntwo.out);
    }

}


