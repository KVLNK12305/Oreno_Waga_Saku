package data_structures;
class double_ll_node{
    int data;
    double_ll_node prev;
    double_ll_node next;

    public double_ll_node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

}
class double_ll{
    private double_ll_node head;
    public int size;

    public double_ll() {
        head = null;
        size = 0;
    }

    public boolean is_empty() {
        return this.size == 0;
    }

    public void insert_first(int data) {
        double_ll_node new_node = new double_ll_node(data);
        if (this.is_empty()) {
            head = new_node;
        } else {
            head.prev = new_node;
            new_node.next = head;
            head = new_node;
        }
        size++;
    }

    public void insert_last(int data) {
        double_ll_node new_node = new double_ll_node(data);
        if (this.is_empty()) {
            head = new_node;
        } else {
            double_ll_node temp = head;
            while (temp.next != null) {  // Traverse to the end of the list
                temp = temp.next;
            }
            temp.next = new_node;
            new_node.prev = temp;
        }
        size++;
    }

    public void delete_first() {
        if (this.is_empty()) throw new IndexOutOfBoundsException("Linked list is Empty");
        if (head.next != null) {
            head = head.next;
            head.prev = null;  // Set the new head's prev to null
        } else {
            head = null;  // If only one element, set head to null
        }
        size--;
    }

    public void delete_last() {
        if (this.is_empty()) throw new IndexOutOfBoundsException("Linked list is Empty");
        if (head.next == null) {
            head = null;  // Only one element in the list
        } else {
            double_ll_node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.prev.next = null;  // Set second-to-last node's next to null
        }
        size--;
    }

    public void display() {
        if (this.is_empty()) {
            System.out.println("List is empty");
            return;
        }
        double_ll_node curr = head;
        while (curr != null) {  // Traverse and print all nodes
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

}
public class DLL{
    public static void main(String[] args) {
        double_ll list = new double_ll();
        list.insert_first(10); // Insert 10 at the beginning
        list.insert_first(20); // Insert 20 at the beginning
        list.insert_first(30); // Insert 30 at the beginning

        list.display(); // Should print 30 20 10

        list.insert_last(40);  // Insert 40 at the end
        list.display(); // Should print 30 20 10 40

        list.delete_first();  // Delete the first element
        list.display(); // Should print 20 10 40

        list.delete_last();  // Delete the last element
        list.display(); // Should print 20 10
    }
}
