import java.util.*;

public class sjfos {
    static class Process {
        int id, at, bt, remaining, ct;
        Process(int id, int at, int bt) {
            this.id = id;
            this.at = at;
            this.bt = bt;
            this.remaining = bt;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();
        Process[] p = new Process[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter arrival time of P" + (i + 1) + ": ");
            int at = sc.nextInt();
            System.out.print("Enter burst time of P" + (i + 1) + ": ");
            int bt = sc.nextInt();
            p[i] = new Process(i + 1, at, bt);
        }
        int time = 0, completed = 0;
        while (completed < n) {
            int idx = -1;
            int minRem = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (p[i].at <= time && p[i].remaining > 0) {
                    if (p[i].remaining < minRem) {
                        minRem = p[i].remaining;
                        idx = i;
                    }
                }
            }
            if (idx == -1) {
                time++;
            } else {
                p[idx].remaining--;
                time++;
                if (p[idx].remaining == 0) {
                    p[idx].ct = time;
                    completed++;
                }
            }
        }
        double avgTAT = 0, avgWT = 0;
        System.out.println("\nPID\tAT\tBT\tCT\tTAT\tWT");
        for (Process proc : p) {
            int tat = proc.ct - proc.at;
            int wt = tat - proc.bt;
            System.out.printf("P%d\t%d\t%d\t%d\t%d\t%d\n",
                    proc.id, proc.at, proc.bt, proc.ct, tat, wt);
            avgTAT += tat;
            avgWT += wt;
        }
        System.out.printf("\nAverage TAT = %.2f\n", avgTAT / n);
        System.out.printf("Average WT  = %.2f\n", avgWT / n);
        sc.close();
    }
}

