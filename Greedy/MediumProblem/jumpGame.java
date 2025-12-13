package Greedy.MediumProblem;

public class jumpGame(int[] nums) {
        int maxIndex=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxIndex){
                return false;
            }
            maxIndex=Math.max(maxIndex,i+nums[i]);
        }
        return true;
            }
}
