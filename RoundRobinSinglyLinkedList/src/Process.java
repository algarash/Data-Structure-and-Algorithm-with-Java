public class Process {
    private int ProcessIndex;
    private int ArrivalTime;
    private int BurstTime;
    private int WaitingTime;
    private int RemainingTime;
    private int EndTime;
    private int TurnAroundTime;
    public Process(int ProcessIndex, int arrivalTime, int BurstTime) {
        this.ProcessIndex = ProcessIndex;
        this.ArrivalTime = arrivalTime;
        this.BurstTime = BurstTime;
        this.WaitingTime = 0;
        this.RemainingTime = BurstTime;
    }

    public void setProcessIndex(int processIndex) {
        ProcessIndex = processIndex;
    }

    public void setArrivalTime(int arrivalTime) {
        ArrivalTime = arrivalTime;
    }

    public void setBurstTime(int executingTime) {
        BurstTime = executingTime;
    }

    public void setWaitingTime(int waitingTime) {
        WaitingTime = waitingTime;
    }

    public void setRemainingTime(int remainingTime) {
        RemainingTime = remainingTime;
    }

    public void setEndTime(int endTime) {
        EndTime = endTime;
    }

    public void setTurnAroundTime(int turnAroundTime) {
        TurnAroundTime = turnAroundTime;
    }

    public int getProcessIndex() {
        return ProcessIndex;
    }

    public int getArrivalTime() {
        return ArrivalTime;
    }

    public int getBurstTime() {
        return BurstTime;
    }

    public int getWaitingTime() {
        return WaitingTime;
    }

    public int getRemainingTime() {
        return RemainingTime;
    }

    public int getEndTime() {
        return EndTime;
    }

    public int getTurnAroundTime() {
        return TurnAroundTime;
    }
}
