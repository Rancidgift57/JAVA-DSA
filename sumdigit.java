public class sumdigit{
    public static void main(String[] args){
        int a = 125;
        sumdigit obj = new sumdigit();
        obj.prod(a);
        obj.sumd(a);

    }

    public void sumd(int a){
        int sum = 0;
        while(a>0){ 
            int b = a % 10;
            sum = sum + b;
            a = a/10;
        }
        System.out.println(sum);
    }
    public void prod(int a){
        int pro = 1;
        while(a>0){ 
            int b = a % 10;
            pro = pro * b;
            a = a/10;
        }
        System.out.println(pro);
    }
}
