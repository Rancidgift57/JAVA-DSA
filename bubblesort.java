import java.util.Arrays;
public class bubblesort{
    public static void main(String[] args){
        int[] arr = {2,0,2,1,1,0};
        bubblesort obj = new bubblesort();
        obj.bubsort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    public void bubsort(int[] arr){
        for(int  i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp; 
                }
            }
        }
    }
}