package Greedy.MediumProblem;

import java.util.Arrays;

public class nMeetingRoom(int start[], int end[]) {
        // add your code here
        int n=start.length;
        int schedule[][]=new int[n][2];
        for(int i=0;i<n;i++){
            schedule[i][0]=start[i];
            schedule[i][1]=end[i];
        }
        Arrays.sort(schedule,(a,b)-> a[1]-b[1]);
        int tot=0;
        int last_end=-1;
        for(int i=0;i<n;i++){
            if(schedule[i][0]>last_end){
                tot++;
                last_end=schedule[i][1];
            }
        }
        return tot;
    }
}

