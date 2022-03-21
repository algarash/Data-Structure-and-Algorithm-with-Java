public class Test  extends Node{
    public void init() {
        front = null;
    }//end init

    public void makeNode(int cpuBurstTime) {
        Node newNode = new Node();

        newNode.cpuBurstTime = cpuBurstTime;
        newNode.next = null;
        addAtEnd(newNode);
    }//end makeNode

    public void addAtEnd(Node toAddAtEnd) {
        if(front == null) {
            front = toAddAtEnd;
        }//end if
        else {
            Node tail = findTail();
            tail.next = toAddAtEnd;
        }//end else
    }//end addAtEnd

    public Node findTail() {
        Node curr = front;
        while (curr.next != null) {
            curr = curr.next;
        }//end while
        return curr;
    }//end findTail

    public void printList() {
        if(front != null) {
            Node curr = front;
            int processId = 0;
            while(curr.next != null && curr.next != front) {
                System.out.println("P" + processId + ": " + curr.cpuBurstTime);
                curr = curr.next;
                processId++;
            }//end while
            System.out.println("P" + processId + ": " + curr.cpuBurstTime);
        }//end if
    }//end printList

    public void makeDoublyLinkedList() {
        Node tail = findTail();
        tail.next = front;
    }//end makeDoublyLinkedList

    public int nodeCount() {
        int nodeCount;
        Node curr = front;
        if(front != null) {
            nodeCount = 1;
        }//end if
        else {
            nodeCount = 0;
        }//end else

        while(curr.next != null && curr.next != front) {
            nodeCount += 1;
            curr = curr.next;
        }//end while
        return nodeCount;
    }//end nodeCount

    public int checkForZeroes() {
        int nodeCount = nodeCount();
        int zeroCount = 0;
        int iterationCount = 0;
        boolean isRunning = true;
        Node curr = front;

        while(isRunning) {
            if(curr.next.cpuBurstTime == 0) {
                zeroCount += 1;
            }//end if
            iterationCount += 1;
            if(zeroCount == nodeCount || iterationCount == nodeCount) {
                isRunning = false;
            }//end if
            curr = curr.next;
        }//end while
        return zeroCount;
    }//end checkForZeroes

    public void roundRobinImplementation() {
        Node curr = front;
        int timeQuantum = 5;
        int numOfZeroes = 0;
        int numOfProcesses = nodeCount();
        while(numOfZeroes < numOfProcesses) {
            if(curr.next.cpuBurstTime <= timeQuantum) {
                curr.next.cpuBurstTime = 0;
            }//end if
            else if(curr.next.cpuBurstTime > timeQuantum) {
                curr.next.cpuBurstTime -= timeQuantum;
            }//end else
            numOfZeroes = checkForZeroes();
            curr = curr.next;
        }//end while
        System.out.println("Time Quantum: " + timeQuantum);
        printList();
    }//end roundRobinImplementation
}
