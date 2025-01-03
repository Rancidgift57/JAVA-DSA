import java.util.Arrays;
import java.util.ArrayList;
public class dupliarray{
    public static void main(String[] args){
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        dupliarray obj = new dupliarray();
        System.out.println(obj.removeDuplicates(arr));

    }
        
    public int removeDuplicates(int[] arr) {
        int j = 1;
        for(int i=1;i < arr.length;i++){
            if(arr[i] != arr[i-1]){
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }
}