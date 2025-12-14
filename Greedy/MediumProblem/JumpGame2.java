package Greedy.MediumProblem;

public class JumpGame2 {
    public int jump(int[] nums) {
        int jump=0;
        int maxindex=0;
        int curr_end=0;
        for(int i=0;i<nums.length-1;i++){
            if(i+nums[i]>maxindex){
                maxindex=i+nums[i];
            }
            if(i==curr_end){
                jump++;
                curr_end=maxindex;
            }
        }
        return jump;
        
    }
    
}
