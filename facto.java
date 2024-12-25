public class facto{
    public static void main(String[] args){
        int a = 5;
        facto obj = new facto();
        System.out.println(obj.fact(a));
        
    }
    public int fact(int a){
        if(a <= 1){
            return 1;
        }
        return a * fact(a-1);
    }
}