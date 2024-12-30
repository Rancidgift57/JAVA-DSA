public class backtrack{
    public static void main(String[] args){
        backtrack obj = new backtrack();
        System.out.println(obj.count(3,3));
        obj.path("",3,3);
    }

    public void path(String p ,int r,int c){
        if(r == 1 && c==1){
            System.out.println(p);
            return ;
        }
        if(r > 1){
            path(p+'D',r-1,c);
        }
        if(c >1 ){
            path(p+'R',r,c-1);
        }
        if(r > 1 && c > 1){
            path(p+'I',r-1,c-1);
        }
    }

    public int count(int r,int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);
        return left + right;
    }
}