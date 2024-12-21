import java.util.Scanner;

public class linearsearch{
    public static void main(String[] args)
    {
        int[] arr = {23,45,66,78,9,80};
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER ELEMENT YOU WANY SERACH");
        int number = scanner.nextInt();
        boolean found = false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==number){
                System.out.println(i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("ELEMENT NOT FOUND");
        }

    }
}