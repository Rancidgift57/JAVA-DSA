public class phone{
    public static void main(String[] args){
        phone obj = new phone();
        obj.phonepad("", "13");
     }

    public void phonepad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for(int i = (digit-1)*3;i<(digit*3);i++){
            char ch = (char)('a'+ i);
            phonepad(p+ch,up.substring(1));
        }

    }
}