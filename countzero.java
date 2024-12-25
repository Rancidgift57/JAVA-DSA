public class countzero{
    public static void main(String[] args){
        int a = 10222;
        int count = 0;
        while(a>0){
            int b  = a % 10;
            if(b == 0){
                count++;
            }
            a = a/10;
        }
        System.out.println(count);
    }
}