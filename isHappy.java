public class isHappy{
    public static void main(String[] args){
        isHappy obj = new isHappy();
        System.out.println(obj.ishappy(19));

    }

    public boolean ishappy(int b){
        int slow = b;
        int fast = b;
        do{
            slow  = getsquare(slow);
            fast  = getsquare(getsquare(fast));
        }
        while(slow != fast);
        if(slow == 1){
            return true;
        }
        return false;
    }

    public int getsquare(int a){
        int sum = 0;
        while(a > 0){
            int b = a%10;
            a = a/10;
            sum  = sum + b*b;
        }
        return sum;
    }
}