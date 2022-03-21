import java.util.Scanner;

public class RoundRobinApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SinglyLinkedlistStructure<Process>ready= new SinglyLinkedlistStructure<>();
        SinglyLinkedlistStructure<Process>execution=new SinglyLinkedlistStructure<>();
        SinglyLinkedlistStructure<Process>done=new SinglyLinkedlistStructure<>();
        int[]ArrivalTime={ 0,50,130,190,210,350};
        int[]BurstTime={ 250,170,75,100,130,50 };
//     	Arrival Time: It is the time when a process enters into the
//         ready state.It means the process is ready for execution.
        for (int i = 0; i < ArrivalTime.length; i++) {
            ready.addlast(new Process(i,ArrivalTime[i],BurstTime[i]));
        }
        int quantum=100;
        int currentTime=0;
        execution.addlast(ready.removeFirst());
        String seq="";
        while(!execution.isEmpty())
        {
            if(execution.first().getRemainingTime()>quantum) // remaining=burstTime
            {
                seq+=" -->P"+execution.first().getProcessIndex();
                int x= execution.first().getRemainingTime();
                int index=execution.first().getProcessIndex();
                int rt=execution.first().getRemainingTime()-quantum;
                execution.first().setRemainingTime(rt);
                currentTime+=quantum;
                while(!ready.isEmpty()&&ready.first().getArrivalTime()<=currentTime)
                {
                    execution.addlast(ready.removeFirst());
                }
                execution.addlast(execution.removeFirst());
            }
            else
            {
                seq+=" -->P"+execution.first().getProcessIndex();
                int x= execution.first().getRemainingTime();
                int index=execution.first().getProcessIndex();
                currentTime+=execution.first().getRemainingTime();
                execution.first().setEndTime(currentTime);
                execution.first().setTurnAroundTime(execution.first().getEndTime()-execution.first().getArrivalTime());
                execution.first().setWaitingTime(execution.first().getTurnAroundTime()-execution.first().getBurstTime());
                done.addlast(execution.removeFirst());
            }

        }
        while(!done.isEmpty())
        {
            System.out.println("P"+done.first().getProcessIndex());
            done.removeFirst();
        }
        System.out.println("sequence of processing is "+seq);
    }
}

