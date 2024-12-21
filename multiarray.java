import java.util.Scanner;
public class multiarray{
    public static void main(String[] args)
    {
        int arr[][] = {{1,2,3,4,},
                        {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER YOU WANT TO SEARCH");
        int number = scanner.nextInt();
        boolean found = false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==number){
                    System.out.println("Rows:"+i);
                    System.out.println("Column:"+j);
                    found = true;
                    break;
                }
            }
        }
        if(!found){
            System.out.println("NUMBER NOT FOUND");
        }

    }
}