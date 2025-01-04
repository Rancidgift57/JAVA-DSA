import java.util.Arrays;
public class prac7{
    public static void main(String[] args){
        int[] arr = {4,5,6,1,2,3};
        prac7 obj = new prac7();
        obj.selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void selectionsort(int[] arr){
        for(int i=0;i< arr.length;i++){
            int last = arr.length-i-1;
            int maxele = getmax(arr,0,last);
            swap(arr,last,maxele);
        }
        
    }

    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int getmax(int[] arr,int start,int last){
        int max = start;
        for(int i=start;i< last+1;i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}