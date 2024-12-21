import java.util.Scanner;
public class binarysearch{
    public static void main(String[] args)
    {
        int[] arr = {6,7,45,89,90};
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER NUMBER TO BE SEARCHED");
        int target = scanner.nextInt();
        binarysearch obj = new binarysearch();    
        int b = obj.binsearch(arr,target);
        System.out.println(b);
        
    }

    public int binsearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                 return mid;
            }
        }
        return -1;
    }

}