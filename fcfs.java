import java.util.Arrays;
public class fcfs {
    public static void main(String[]args){
        int[] arrival_time={0,1,2,8};
        int[] burst_time={10,13,6,9};
        int[] t=new int [5];
        int[] wait=new int[4];
        int[] turn= new int[4];
        int sum=0;
        for(int i=0;i<arrival_time.length;i++){
            sum=sum+burst_time[i];
            t[i+1]=sum;
        }
        System.out.println("grand chart: "+Arrays.toString(t));
        for(int i=0;i<t.length-1;i++){
            wait[i]=t[i]-arrival_time[i];
        }
        System.out.println("waiting time:"+Arrays.toString(wait));
        for(int i=0;i<t.length-1;i++){
        turn[i]=t[i+1]-arrival_time[i];

    }
        System.out.println("Turnaround time:"+Arrays.toString(turn));
    float tt=0;
    float wt=0;
    for(int i=0;i<turn.length;i++){
        tt=tt+turn[i];
        wt=wt+wait[i];
    }

    
    float average_waitingtime;
    float average_turn_aroundtime;
    average_waitingtime=tt/turn.length;
    average_turn_aroundtime=wt/wait.length;
    System.out.println("average waiting time:"+average_waitingtime);
    System.out.println("average turnaround time:"+average_turn_aroundtime);
    }
}
