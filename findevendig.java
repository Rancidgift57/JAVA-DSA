import java.util.Scanner;
public class findevendig{
    public static int evendigit(int[] arr)
    {        
        int digitcount = 0;
        for(int i=0;i<arr.length;i++)
        {
            int b = count(arr[i]);
            if(b%2 == 0){
                digitcount = digitcount + 1;            }
            
        }
        return digitcount;
    }
    static int count(int a){
        int count = 0;
        while(a > 0){
            count = count+1;
            a = a/10;
        }
        return count;
    }
    public static void main(String[] args){
        int arr[] = {23,455,67,8,900};
        int c = evendigit(arr);
        System.out.println(c);
    }
    
    
}