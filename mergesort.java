import java.util.Arrays;

public class mergesort{
    public static void main(String[] args){
        int[] arr = {9,8,7,6,5,4,3};
        mergesort obj = new mergesort();
        arr = obj.mersort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public int[] mersort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = (arr.length)/2;
        int[] left = mersort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mersort(Arrays.copyOfRange(arr, mid,arr.length));

        return merge(left,right);
    }

    public int[] merge(int[] first,int[] second){
        int[] mix = new int[first.length+second.length];
        int i=0,j=0;
        int k =0;
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
