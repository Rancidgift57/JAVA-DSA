import java.util.Arrays;
public class selectionsort{
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        selectionsort obj = new selectionsort();
        obj.selection(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    public void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp; 
    }

    public int getmax(int[] arr,int start,int last){
        int max = start;
        for(int i=start;i<last+1;i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    public void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxele = getmax(arr,0,last);
            swap(arr,maxele,last);
        }
    }
}