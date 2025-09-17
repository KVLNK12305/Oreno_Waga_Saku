package data_structures;
class Node{
    int data;
    Node node;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class cll{
    Node head;
    int size;
    public cll(){
        this.size = 0;
        this.head = null;
    }
    public boolean is_empty(){
        return this.size == 0;
    }
    public void insert_first(int data){
        Node new_node = new Node(data);
        if (is_empty()) {
            head = new_node;
            head.next = new_node;
        }
        Node last = head;
        while(last.next != head){
            last = last.next;
        }
        last.next = new_node;
        new_node.next = head;
        head = new_node;
        size++;
    }
    
    public void insert_last(int data){
        Node new_node = new Node(data);
        if (is_empty()) {
            head = new_node;
            head.next = new_node;
        }
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = new_node;
        new_node.next = this.head;
        size++;
    }

    public void delete_first() {
        if (is_empty()) throw new IndexOutOfBoundsException("List is empty");
        
        if (this.size == 1) {
            System.out.println("Deleted: " + head.data);  // Print the only element
            this.head = null;
        } else {
            Node H = this.head;
            while (H.next != head) {  // Find the last node
                H = H.next;
            }
            System.out.println("Deleted: " + head.data);  // Print the first element
            head = head.next;        // Move head to the second node
            H.next = head;           // Last node points to the new head
        }
        size--;
    }

    public void delete_last() {
        if (is_empty()) throw new IndexOutOfBoundsException("List is empty");
        
        if (this.size == 1) {
            System.out.println("Deleted: " + head.data);  // Print the only element
            this.head = null;
        } else {
            Node H = this.head;
            while (H.next.next != head) {  // Find the second-to-last node
                H = H.next;
            }
            System.out.println("Deleted: " + H.next.data);  // Print the last element
            H.next = this.head;            // Remove the last node by linking to head
        }
        size--;
    }

    // public boolean loop_exists(){ // need to get logic of sir's and try to implement that.
    //     return false;
    // }

    public int get_Size(){
        return this.size;
    }
    public void display(){
        if (is_empty()) {
            System.out.println("List is empty");
            return;
        }
        Node temp = this.head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}
class Circular{
    public static void main(String[] args) {
        cll list = new cll();
        list.insert_first(10);
        list.insert_last(20);
        list.delete_first();
        System.out.println("Size of the list: " + list.get_Size());
    }
}