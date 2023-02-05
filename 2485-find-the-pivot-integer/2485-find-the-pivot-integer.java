class Solution {

public int pivotIndex(int[] nums) {
     
    int sum = 0;
    for(int value : nums){
        sum = sum + value;
    } 
    int start = 0;
    for(int i = 0; i<nums.length; i++){
         
        sum = sum - nums[i];
        if(start == sum){
            return i;
        }
        start = start + nums[i];
    }
    return -1;
}
    
public int pivotInteger(int n) {
    int[] array = new int[n];
    
    for(int i=1; i<=n; i++){
        array[i-1]=i;
    }
    
    int res = pivotIndex(array);
    if(res==-1){
        return -1;
    }
    return array[res];
}
}