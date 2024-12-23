import java.util.Arrays;
public class missnum{
    public static void main(String[] args){
        int[] arr = {3,0,1};
        missnum obj = new missnum();
        obj.cycle(arr);
        //System.out.println(Arrays.toString(arr));
    }

    public int cycle(int[] arr)
    {
        int i=0;
        while (i < arr.length){
            int in = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[in]){
                swap(arr,i,in);
            }
            else{
                i++;
            }
        }
        for(int index=0;index < arr.length;index++){
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;

        
    }

    public void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp; 
    }

}