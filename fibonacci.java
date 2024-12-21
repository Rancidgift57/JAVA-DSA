//import java.util.Scanner
public class fibonacci{
    public static void main(String[] args){
        int n=10;
        int firstterm = 0;
        int secondterm = 1;
        for(int i=0;i<n;i++)
        {
            System.out.println(firstterm + " ");
            int nextterm = firstterm + secondterm;
            firstterm = secondterm;
            secondterm = nextterm;



        }
        
    }

}