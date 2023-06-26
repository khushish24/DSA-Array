class Solution {
    public void sortColors(int[] nums) {
        int countZero=0;
        int countOne=0;
        int temp[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                countZero++;
            }else if(nums[i]==1){
                countOne++;
            }
        }
        //to fill the array now with zero first
        for(int i=0;i<countZero;i++){
            nums[i]=0;
        }
        //to fill the array now with one now
        for(int i=countZero;i<(countZero+countOne);i++){
            nums[i]=1;
        }
         //to fill the array now with two now
        for(int i=(countOne+countZero);i<nums.length;i++){
            nums[i]=2;
        }
        

    }
}
