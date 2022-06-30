public class CircularQueue {
    static class CQueue{
        int front;
        int rear;
        int size;
        int[] queue;

        public CQueue(){
            this.front = 0;
            this.rear =0;
            this.size =10;
            this.queue = new int[10];
        }

        public CQueue(int size){
            this.front = 0;
            this.rear = 0;
            this.size = size;
            this.queue = new int[size];
        }
        public boolean isEmpty(){
            return front == rear;
        }
        public boolean isFull(){
            return (rear+1)%size == front;
        }

        public int deQueue(){
            if(isEmpty()){
                return -1;
            }
            front = (front+1)%size;
            return queue[front];
        }

        public void enQueue(int num){
            if (isFull()) {

                System.out.println("isFull");
            }
            else{
                rear = (rear+1)%size;
                queue[rear] = num;

            }
        }
    }
    public static void main(String[] args) {
       CQueue cq = new CQueue(4);
       cq.enQueue(3);
       cq.enQueue(4);
       cq.enQueue(4);
        System.out.println(cq.deQueue());
        System.out.println(cq.deQueue());
        System.out.println(cq.deQueue());

        System.out.println(cq.deQueue());


    }
}
