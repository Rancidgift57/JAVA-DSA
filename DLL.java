public class DLL{
    private class Node{
        int val;
        Node next;
        Node prev;

    public Node(int val){
        this.val = val;
    }
    public Node(int val,Node next,Node prev){
        this.val = val;
        this.next = next;
        this.prev = prev;
    } 
}
    private Node head;
    private Node tail;

    public void insertfirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.val + "->");
            last = temp;
            temp = temp.next;
        }
        System.out.print("END");
        
        while(last != null){
            System.out.print(last.val + "->");
            last = last.prev;
        }
        System.out.println();
    }
        
}