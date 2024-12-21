public class Swap{
    public static void main(String[] args)
    {
        int[] arr = {2,4,5,6,788,90};
        printlist(arr);
        swap(arr,1,3);
        printlist(arr);

    }
    static void swap(int[] arr,int index1,int index2)
    {
        int temp =  arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static void printlist(int[] arr)
    {
        int i;
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}