import java.util.Scanner;
public class richwealth{

    public int maxweal(int[][] arr){
        int overall = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int sum = 0;
            for(int j=0;j<arr[i].length;j++)
            {
                sum = sum + arr[i][j];
            }
            if(sum > overall){
                overall = sum;
            }
            
        }
        return overall;
    }

    public static void main(String[] args){
        int[][] arr = {{1,2,3},
                    {5,7,8}};
        richwealth obj = new richwealth(); 
        int b = obj.maxweal(arr);
        System.out.println(b);
    }
}

    
