package data_structures;

class SLLNode {
    int data;
    SLLNode next;

    public SLLNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class sll {
    private SLLNode head;
    private int size; // Moved the size variable here

    public sll() {
        head = null;
        size = 0; // Initialize size here
    }

    // Inserts at the beginning of the list
    public void insert_first(int data) {
        SLLNode new_node = new SLLNode(data);
        if (this.size == 0) {
            head = new_node;
        } else {
            new_node.next = head;
            head = new_node;
        }
        size++;
    }

    // Inserts at the end of the list
    public void insert_last(int data) {
        SLLNode new_node = new SLLNode(data);
        if (this.size == 0) {
            head = new_node;
        } else {
            SLLNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
        size++;
    }

    // Deletes the first SLLnode
    public void delete_first() {
        if (this.size == 0) throw new IndexOutOfBoundsException("Empty List");
        head = head.next;
        size--;
    }

    // Deletes the last SLLnode
    public void delete_last() {
        if (this.size == 0) throw new IndexOutOfBoundsException("Empty List");

        if (head.next == null) { // If there's only one element
            head = null;
        } else {
            SLLNode temp = head;
            while (temp.next.next != null) { // Traverse until second last SLLnode
                temp = temp.next;
            }
            temp.next = null;
        }
        size--;
    }
    // Optional: Get size of the list
    public int get_size() {
        return size;
    }

}

class SLL {
    public static void main(String[] args) {
        sll list = new sll();
        list.insert_first(10);
        list.insert_last(20);
        list.delete_first();
        System.out.println("Size of the list: " + list.get_size());
    }
}
