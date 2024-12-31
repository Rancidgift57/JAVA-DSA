public static LL merge(LL first,LL second){
    Node f = first.head;
    Node s = second.head;
    LL ans = new LL();
    while(f != null && s != null){
        if(f.value < s.value){
            ans.insertfirst(f.value);
            f = f.next;
        }
        else{
            ans.insertfirst(s.value);
            s = s.next;
        }
    }
    while(f != null){
        ans.insertfirst(f.value);
        f = f.next;
    }
    while(s != null){
        ans.insertfirst(s.value);
        s = s.next;
    }
}