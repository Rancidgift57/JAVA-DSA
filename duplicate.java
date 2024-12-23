import java.util.Arrays;
public class duplicate{
    public static void main(String[] args){
        int[] arr = {1,3,4,2,1};
        duplicate obj = new duplicate();
        int yu = obj.cycle(arr);
        System.out.println(yu);
    }

    public int cycle(int[] arr)
    {
        int i=0;
        while (i < arr.length){
            if(arr[i] != i+1){
                int in = arr[i]-1;
                if(arr[i] != arr[in]){
                    swap(arr,i,in);
                }
                else{
                    return arr[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }

    public void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp; 
    }

}