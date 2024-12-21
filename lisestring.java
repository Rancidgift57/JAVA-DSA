import java.util.Scanner;

public class lisestring{
    public static void main(String[] args){
        String name = "nikhil";
        char target = 'i';
        boolean found = false;
        int length = name.length();
        for(int i=0;i<length;i++){
            if(name.charAt(i)==target){
                System.out.println(i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("CHARACTER NOT FOUND IN STRING");
        }
    }
}