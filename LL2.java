public class LL{
    
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }
    
    public void insertfirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size = size + 1;
    }

    public int deletefirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size = size - 1;
        return val;
    }

    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return node;
    }

    public int delete(int index){
        if(index == 0){
            return deletefirst();
        }
        if(index == size - 1){
            return deletelast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        return val;
    }

    public int deletelast(){
        if(size <= 1){
            return deletelast();
        }
        Node secondlast = get(size - 2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        return val;
    }

public Node get(int index){
    Node node = head;
    for(int i = 0;i < index;i++){
        node = node.next;
    }
    return node;
}
    
public void display(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.value + "->");
        temp = temp.next;
    }
    System.out.print("END");
}


    private class Node{
        private int value;
        private Node next;

    public Node(int value){
        this.value = value;
    }

    public Node(int value,Node next){
        this.value = value;
        this.next = next;
    }
}
}