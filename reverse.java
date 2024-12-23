import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class reverse{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6};
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int k = arr.length-i;
            ans.add(k);
        }
        System.out.println(ans);
    }
}