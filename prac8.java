import java.util.Arrays;
public class prac8{
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        prac8 obj = new prac8();
        obj.cyclesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public void cyclesort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int in = arr[i] - 1;
            if(arr[i] != arr[in]){
                swap(arr,i,in);
            }
            else{
                i = i + 1;
            }
        }
    }
}