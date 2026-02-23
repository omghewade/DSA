public class Linklist {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
    public static Node head;
    public static Node tail;

    public void add(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data)
    {

        Node newNode1 = new Node(data);
        if(head == null)
        {
            head = tail =  newNode1 ; 


        }

        tail.next = newNode1;
        tail = newNode1;

    }

    public static void main(String[] args) {

        Linklist list = new Linklist();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

  

         Node temp = head ;
         while(temp != null)
         {
            System.err.print(temp.data+"  ");
            temp = temp.next;
         }
    }

}
