public class Cll {
    private class Node {
        int data;
        Node next;
       // private String val;
       public Node (int data)
       {
           this.data = data;
           this.next = null;
       }
    }
    
    Node head;
    Node tail;

    public Cll()
    {
        this.head = null;
        this.tail = null;
    }

    //Inserting data into circular linked list
    public void insertFirst(int data) {
        Node node = new Node(data);
        if(head == null) 
        {
            head = node;
            tail = node;
           // tail.next = head;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    } 

    public void deletion(int data) {
        Node node = head;
       if(head == null)
       {
        return;
       }
       if(node.data == data) {
        head = head.next;
        tail.next = head;
        return;
       }

       do { 
           Node n = node.next;

           if(n.data ==  data) {
                node.next = n.next;
                break;
           }
           node = node.next;
       } while (node != head);
    }
    public void display() {
    Node n = head;
    if(head != null) {
        do { 
            System.out.print(n.data + " -> ");
            n = n.next;
        } while (n != head);
    }
    System.out.println("Head");
        
    }

    public static void main(String[] args) {
        Cll list = new Cll();
        list.insertFirst(11);
        list.insertFirst(22);
        list.insertFirst(33);
        list.insertFirst(44);
        list.insertFirst(55);
        list.deletion(33);

        list.display();
    }
}
