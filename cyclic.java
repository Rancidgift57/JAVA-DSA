import java.util.Arrays;
public class cyclic{
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        cyclic obj = new cyclic();
        obj.cycle(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void cycle(int[] arr)
    {
        int i=0;
        while (i < arr.length){
            int in = arr[i] - 1;
            if(arr[i] != arr[in]){
                swap(arr,i,in);
            }
            else{
                i++;
            }
        }
    }

    public void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp; 
    }

}