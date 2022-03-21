public class Round_R_Singly_linked_list {
    private Node head=null;
    private Node tail=null;
    int noOfProcess=0;

    public Round_R_Singly_linked_list( ) {
    }

    public boolean isEmpty(){
        return noOfProcess==0;
    } /// check if the list is empty
    public int noOfProcess(){
        return noOfProcess;
    }
    // return the number of process inserted to the CPU
    public int first_process(){
        if (isEmpty())return 0;
        return head.getCpuBrustTime();

    } // to get last and first process
    public int last_process(){
        if (isEmpty())return 0;
        return tail.getCpuBrustTime();
    }
    // no adding in the head
    // usually new processes are added in the tail of a list in round robin scheduler
    public void new_process (int burstTime){
        Node newnode= new Node(burstTime, null);
        if (isEmpty())
            head=newnode;
        else tail.setNext(newnode);
        tail=newnode;
        noOfProcess++;
    }

    // To print the list of processes and its burst time

    public void printList() {
        if(head != null) {
            Node curr = head;
            int processId = 0;
            while(curr.next != null && curr.next != head) {
                System.out.println("P" + processId + ": " + curr.cpuBrustTime);
                curr = curr.next;
                processId++;
            }//end while
            System.out.println("P" + processId + ": " + curr.cpuBrustTime);
        }//end if
    }

    /// codes to test the time quantum and the burst time after processing time
//
//    public void roundRobinImplementation() {
//        int timeQuantum = 5;
//        while( true) {
//            if(head.getCpuBrustTime() <= timeQuantum) {
//                head.cpuBrustTime=0;
//
//            }
//            else if(head.getCpuBrustTime()> timeQuantum) {
//                head.cpuBrustTime-= timeQuantum;
//            }
//            head = head.getNext();
//        }
//
//    }














    public class Node{
        private int cpuBrustTime;
        private Node next;
        public Node(int cpuBrustTime, Node next) {
            this.cpuBrustTime = cpuBrustTime;
            this.next = next;
        }

        public int getCpuBrustTime() {
            return cpuBrustTime;
        }

        public void setCpuBrustTime(int cpuBrustTime) {
            this.cpuBrustTime = cpuBrustTime;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
