public class reversenum{
    public static void main(String[] args){
        int a = 121;
        reversenum obj = new reversenum();
        boolean y = obj.palindrome(a);
        System.out.println(y);
    
    }

    public boolean palindrome(int a){
        int original = a;
        int rev = 0;
        while(a>0){
            int f = a % 10;
            rev = rev *10 + f;
            a = a/10;
        }
        return original == rev;
    }
}