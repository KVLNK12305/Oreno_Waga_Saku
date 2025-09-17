package data_structures;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LLbC{
    Node head;
    int size;
    public LLbC(){
        this.size = 0;
        this.head = null;
    }
    public boolean is_empty(){
        if (size == 0) return true;
        return false;
    }
    public int get_size() {
        return size;
    }
    public void push(int data){
        Node new_node = new Node(data);
        if (this.size == 0) {
            head = new_node;
        } else {
            new_node.next = head;
            head = new_node;
        }
        size++;
    }
    public void pop(){
        if (is_empty()) throw new IndexOutOfBoundsException("Empty List");
        System.out.println(head.data);
        head = head.next;
        size--;
    }
    public void top(){
        if (is_empty()) throw new IndexOutOfBoundsException("Empty List");
        System.out.println(this.head.data);
    }
}
public class Stack {
    public static void main(String[] args) {
        LLbC x = new LLbC();
        x.push(25);
        x.push(54);
        x.pop();
        x.get_size();
        x.top();
        x.pop();
        System.out.println(x.is_empty());
    }
}
