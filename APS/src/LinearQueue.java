public class LinearQueue {
    static int size = 100;
    static int front = -1;
    static int rear = -1;
    static int[] Queue = new int[size];
    public static void main(String[] args) {
        enQueue(1);
        enQueue(2);
        enQueue(3);
        System.out.println(deQueue());
        System.out.println(deQueue());
        System.out.println(deQueue());
    }
    static boolean isEmpty(){
        return front == rear;
    }
    static boolean isFull(){
        return rear == size-1;
    }
    static void enQueue(int num){
        if(isFull()){
            return;
        }
        Queue[++rear] = num;
    }
    static int deQueue(){
        if(isEmpty()){
            return -1;
        }
        return Queue[++front];
    }
}
