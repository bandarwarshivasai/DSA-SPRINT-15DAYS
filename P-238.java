class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] leftp=new int[n];
        int[] rightp=new int[n];
        int l=1;
        for(int i=0;i<n;i++){
            leftp[i]=l;
            l=l*nums[i];
        }
        int r=1;
        for(int i=n-1;i>=0;i--){
            rightp[i]=r;
            r=r*nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=leftp[i]*rightp[i];
        }
        return nums;
    }
}
