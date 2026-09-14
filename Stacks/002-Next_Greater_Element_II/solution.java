class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> s = new Stack<>();
        int[] result = new int[n];
        Arrays.fill(result,-1);
        for(int i = 0; i < 2 * n; i++){
            int index = i % n;
            while(!s.isEmpty() && nums[index] > nums[s.peek()]){
                result[s.peek()] = nums[index];
                s.pop();
            }
            if(i == index)
                s.push(i);
        }
        return result;
    }
}