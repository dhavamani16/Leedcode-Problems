import java.util.ArrayList;

public class jobSequence {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        int n=deadline.length;
        int jobs[][]=new int[n][2];
        int max_deadline=-1;
        for(int i=0;i<n;i++){
            jobs[i][0]=deadline;
            jobs[i][1]=profit;
            if(deadline[i]>max_deadline)
                max_deadline=deadline[i];
            
        }
        Arrays.sort(jobs,(a,b)->b[1]-a[1]);
        int slot[]=new int[max_deadline+1];
        int job_cnt=0,prft=0;
        for(int i=0;i<n;i++){
            int j=jobs[i][0];
            while(j>0 && slot[j]==1){
                j--;
            }
            if(j>0){
                slot[j]=1;
                job_cnt++;
                prft+=jobs[i][1];
            }
        }
        return new ArrayList<Integer>(Arrays.asList(job_cnt))
        
        
        
    }
}
    

