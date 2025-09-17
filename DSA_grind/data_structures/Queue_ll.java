package data_structures;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private Node head;
    private Node tail;  // Add a tail pointer to track the rear of the queue
    private int size;

    public int get_size() {
        return size;
    }

    public boolean is_empty() {
        return this.size == 0;
    }

    // Add elements to the rear of the queue
    public void enqueue(int data) {
        Node new_node = new Node(data);
        if (is_empty()) {
            head = new_node;
            tail = new_node;  // Both head and tail point to the first element
        } else {
            tail.next = new_node;  // Link the old tail to the new node
            tail = new_node;       // Move the tail to the new node
        }
        size++;
    }

    // Remove elements from the front of the queue
    public void dequeue() {
        if (is_empty()) throw new ArrayIndexOutOfBoundsException("Empty Queue");
        
        head = head.next;  // Move the head to the next node
        size--;

        if (head == null) {
            tail = null;  // If the queue is empty, reset the tail to null
        }
    }

    // Get the front element (the head of the queue)
    public int get_front() {
        if (is_empty()) throw new ArrayIndexOutOfBoundsException("Empty Queue");
        return head.data;
    }

    // Get the rear element (the tail of the queue)
    public int get_rear() {
        if (is_empty()) throw new ArrayIndexOutOfBoundsException("Empty Queue");
        return tail.data;
    }
}

class Queue_ll {
    public static void main(String[] args) {
        Queue test = new Queue();
        test.enqueue(8);
        test.enqueue(9);
        System.out.println("Size: " + test.get_size()); // Output: 2
        System.out.println("Front: " + test.get_front()); // Output: 8
        System.out.println("Rear: " + test.get_rear());   // Output: 9
        test.dequeue();
        System.out.println("Front after dequeue: " + test.get_front()); // Output: 9
        System.out.println("Size after dequeue: " + test.get_size());   // Output: 1
    }
}
