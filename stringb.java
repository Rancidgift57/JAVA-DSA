import java.util.Arrays;
public class stringb{
    public static void main(String[] args){
        String a = new String("new world");
        String b = new String("new world");
        int[] c = {7,8,9,0,10};
        System.out.println(a.equals(b));
        System.out.println(Arrays.toString(c));
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        builder.deleteCharAt(0);
        builder.reverse();
        System.out.println(builder);
        System.out.println(builder);
        
    }
}