package trien_khai_queue_array;

public class MyQueue {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(24);
        queue.dequeue();
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(23);
        queue.enqueue(435);
    }

    private int capicity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capicity = queueSize;
        queueArr = new int[this.capicity];
    }

    public boolean isQueueFull() {
        boolean status = false;
        if (currentSize == capicity) {
            status = true;
        }
        return status;
    }

    public boolean isQueueEmpty() {
        boolean status = false;
        if (currentSize == 0) {
            status = true;
        }
        return status;
    }

    public void enqueue(int item) {
        if (isQueueEmpty()) {
            System.out.println("Không thể thêm phần tử: " + item);
        } else {
            tail++;
            if (tail == capicity - 1) {
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Phần tử " + item + " được thêm !");
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Không thể xóa khỏi phần tử");
        } else {
            head++;
            if (head == capicity - 1) {
                System.out.println(queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println(queueArr[head - 1]);
            }
            currentSize--;
        }
    }


}
