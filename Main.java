import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        LL list = new LL();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER  OF VALUES:");
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            System.out.println("ENTER NUMBER:");
            int ni = sc.nextInt();
            list.insertfirst(ni);
        }
        
        //list.insertfirst(5);
        //list.insertfirst(10);
        list.display();
    }
}